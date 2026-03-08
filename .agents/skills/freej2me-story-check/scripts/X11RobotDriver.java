import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Locale;

public class X11RobotDriver {
    private static int keyCode(String name) {
        return switch (name.toUpperCase(Locale.ROOT)) {
            case "ENTER" -> KeyEvent.VK_ENTER;
            case "UP" -> KeyEvent.VK_UP;
            case "DOWN" -> KeyEvent.VK_DOWN;
            case "LEFT" -> KeyEvent.VK_LEFT;
            case "RIGHT" -> KeyEvent.VK_RIGHT;
            case "ESC" -> KeyEvent.VK_ESCAPE;
            case "Q" -> KeyEvent.VK_Q;
            case "W" -> KeyEvent.VK_W;
            case "E" -> KeyEvent.VK_E;
            case "R" -> KeyEvent.VK_R;
            case "1" -> KeyEvent.VK_1;
            case "2" -> KeyEvent.VK_2;
            case "3" -> KeyEvent.VK_3;
            case "4" -> KeyEvent.VK_4;
            case "5" -> KeyEvent.VK_5;
            case "6" -> KeyEvent.VK_6;
            case "7" -> KeyEvent.VK_7;
            case "8" -> KeyEvent.VK_8;
            case "9" -> KeyEvent.VK_9;
            case "0" -> KeyEvent.VK_0;
            default -> throw new IllegalArgumentException("Unsupported key: " + name);
        };
    }

    private static int charKeyCode(char value) {
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(value);
        if (keyCode == KeyEvent.VK_UNDEFINED) {
            throw new IllegalArgumentException("Unsupported character: " + value);
        }
        return keyCode;
    }

    private static boolean needsShift(char value) {
        return Character.isUpperCase(value) || "~!@#$%^&*()_+{}|:\"<>?".indexOf(value) >= 0;
    }

    private static void typeChar(Robot robot, char value, int delayMs) {
        int keyCode = charKeyCode(value);
        boolean useShift = needsShift(value);
        if (useShift) {
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.delay(20);
        }
        robot.keyPress(keyCode);
        robot.delay(30);
        robot.keyRelease(keyCode);
        if (useShift) {
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
        robot.delay(delayMs);
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: click <x> <y> | press <delayMs> <key>... | type <delayMs> <text>");
        }

        Robot robot = new Robot();
        robot.setAutoWaitForIdle(true);

        switch (args[0]) {
            case "click" -> {
                int x = Integer.parseInt(args[1]);
                int y = Integer.parseInt(args[2]);
                robot.mouseMove(x, y);
                robot.delay(80);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(60);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
            case "press" -> {
                int delayMs = Integer.parseInt(args[1]);
                for (int i = 2; i < args.length; i++) {
                    int code = keyCode(args[i]);
                    robot.keyPress(code);
                    robot.delay(40);
                    robot.keyRelease(code);
                    robot.delay(delayMs);
                }
            }
            case "type" -> {
                int delayMs = Integer.parseInt(args[1]);
                String text = args[2];
                for (int i = 0; i < text.length(); i++) {
                    typeChar(robot, text.charAt(i), delayMs);
                }
            }
            default -> throw new IllegalArgumentException("Unknown action: " + args[0]);
        }
    }
}
