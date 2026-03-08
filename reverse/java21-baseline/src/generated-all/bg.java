/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.util.Vector;
import javax.microedition.rms.RecordStore;

public final class bg {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static void a(int var0) {
        block208: {
            var0 = af.a(var0);
            if (ba.a.a != 2 || ba.a.b != 3) break block208;
            if (ba.a.a == null) {
                ba.a.b = 1;
                return;
            }
            switch (ba.a.a.a) {
                case 1: {
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        bg.a();
                        ba.a.d(0);
                        return;
                    }
                    if (var0 == 2) {
                        ba.a.a.g();
                        return;
                    }
                    if (var0 == 5) {
                        ba.a.a.f();
                        return;
                    }
                    if (var0 != 8) break;
                    ba.a.a.c();
                    ba.a.a.a = false;
                    return;
                }
                case 2: {
                    if (ba.a.a.i == 1) {
                        if (var0 == 8) {
                            ba.a.a.u = 0;
                            ba.a.a.i = (byte)2;
                            ba.a.a.a = false;
                            return;
                        }
                        if (var0 == af.g) {
                            ba.a.a.a = false;
                            ba.a.a.e();
                            return;
                        }
                        if (var0 == 2) {
                            ba.a.a.g();
                            return;
                        }
                        if (var0 != 5) break;
                        ba.a.a.f();
                        return;
                    }
                    if (ba.a.a.i != 2) break;
                    if (var0 == 8) {
                        ba.a.a.a = false;
                        ba.a.a.i = 1;
                        ah.a(ah.a);
                        return;
                    }
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        ba.a.a.i = 1;
                        ah.b(ah.a);
                        return;
                    }
                    if (var0 == 1) {
                        ba.a.a.u = (byte)(ba.a.a.u - 1);
                        ba.a.a.u = (byte)(ba.a.a.u < 0 ? 3 : (int)ba.a.a.u);
                        return;
                    }
                    if (var0 == 6) {
                        ba.a.a.u = (byte)(ba.a.a.u + 1);
                        ba.a.a.u = ba.a.a.u > 3 ? 0 : ba.a.a.u;
                        return;
                    }
                    if (var0 == 2) {
                        ba.a.a.g();
                        return;
                    }
                    if (var0 != 5) break;
                    ba.a.a.f();
                    return;
                }
                case 3: {
                    if (var0 == 8) {
                        ba.a.a.a = false;
                        if (ah.a[ah.r].a[3] <= 0) {
                            return;
                        }
                        if (ba.a.a.a == null) break;
                        ba.a.a.d();
                        if (ba.a.a.a[0] != null) {
                            ah.K = 1;
                            ba.a.a.j = 0;
                            return;
                        }
                        if (ba.a.a.a[1] == null) break;
                        ah.K = (byte)2;
                        ba.a.a.k = 0;
                        return;
                    }
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        ba.a.a.e();
                        return;
                    }
                    if (var0 == 2) {
                        ba.a.a.g();
                        return;
                    }
                    if (var0 != 5) break;
                    ba.a.a.f();
                    return;
                }
                case 4: {
                    ba.a.a.a = false;
                    if (ba.a.a.i == 3) {
                        if (var0 == 8) {
                            ba.a.a.i = (byte)4;
                        } else if (var0 == af.g) {
                            ba.a.a.e();
                        } else if (var0 == 1) {
                            if (ah.K == 1) {
                                if (ba.a.a.j >= ah.J) {
                                    ba.a.a.I = (byte)(ba.a.a.I - 2);
                                }
                                if (ba.a.a.j >= 2) {
                                    ba.a.a.j = (byte)(ba.a.a.j - 2);
                                    ba.a.a.j = ba.a.a.j <= 0 ? 0 : ba.a.a.j;
                                }
                            } else if (ah.K == 2) {
                                if (ba.a.a.k >= ah.J) {
                                    ba.a.a.I = (byte)(ba.a.a.I - 2);
                                }
                                if (ba.a.a.k >= 2) {
                                    ba.a.a.k = (byte)(ba.a.a.k - 2);
                                    ba.a.a.k = ba.a.a.k <= 0 ? 0 : ba.a.a.k;
                                }
                            }
                        } else if (var0 == 6) {
                            if (ah.K == 1) {
                                if (ba.a.a.j + 2 <= ba.a.a.a[0].length - 1) {
                                    ba.a.a.j = (byte)(ba.a.a.j + 2);
                                    if (ba.a.a.j >= ah.J) {
                                        ba.a.a.I = (byte)(ba.a.a.I + 2);
                                    }
                                }
                            } else if (ah.K == 2 && ba.a.a.k + 2 <= ba.a.a.a[1].length - 1) {
                                ba.a.a.k = (byte)(ba.a.a.k + 2);
                                if (ba.a.a.k >= ah.J) {
                                    ba.a.a.I = (byte)(ba.a.a.I + 2);
                                }
                            }
                        } else if (var0 == 2) {
                            ba.a.a.g();
                        } else if (var0 == 5) {
                            ba.a.a.f();
                        }
                        ah.j();
                        break;
                    }
                    if (ba.a.a.i == 4) {
                        if (var0 == 8) {
                            ba.a.a.a = false;
                            if (ah.K == 1) {
                                c.a(ah.a[ah.r], ba.a.a.a[0][ba.a.a.j]);
                            } else if (ah.K == 2) {
                                c.a(ah.a[ah.r], ba.a.a.a[1][ba.a.a.k]);
                            }
                            ba.a.a.i = (byte)3;
                        } else if (var0 == af.g) {
                            ba.a.a.a = false;
                            ba.a.a.i = (byte)3;
                        }
                        ah.j();
                    }
                    return;
                }
                case 6: {
                    ah.j();
                    ba.a.a.k = false;
                    ba.a.a.e = false;
                    if (ba.a.a.i != 5) ** GOTO lbl245
                    if (var0 != 8) ** GOTO lbl194
                    ba.a.a.a = false;
                    if (ah.g == 1) {
                        if (ah.b + ah.a > 0) {
                            ba.a.a.i = (byte)6;
                            ba.a.a.v = 0;
                            break;
                        }
                    } else if (ah.g == 0) {
                        if (ba.a.a.d == 0) {
                            v0 = (short)(ah.b + ah.a + ah.c);
                            var0 = v0;
                            if (v0 == 0 || ah.t >= var0) break;
                            ba.a.a.d = 1;
                            break;
                        }
                        if (ba.a.a.d == 1) {
                            if (ba.a.a.e == 1) {
                                if (ah.b + ah.a + ah.c > 0) {
                                    if (ah.t < ah.b) {
                                        s.c(s.a[ah.t][0], 1);
                                    } else if (ah.t < ah.b + ah.a) {
                                        var0_1 = s.a(ah.t - ah.b);
                                        var1_12 = (byte)var0_1[0];
                                        var2_22 = (byte)var0_1[1];
                                        s.f(var1_12, var2_22);
                                    } else if (ah.t < ah.b + ah.a + ah.c) {
                                        var0_2 = s.b(ah.t - ah.b - ah.a);
                                        var1_13 = (byte)var0_2[0];
                                        var2_23 = (byte)var0_2[1];
                                        s.d(s.a[var1_13][var2_23][0], 1);
                                    }
                                    s.a += ah.d;
                                }
                                ba.a.a.d = 0;
                                ba.a.a.e = 0;
                                break;
                            }
                            if (ba.a.a.e == 0) {
                                ba.a.a.d = 0;
                                break;
                            }
                        }
                    }
                    ** GOTO lbl345
lbl194:
                    // 1 sources

                    if (var0 != af.g) ** GOTO lbl205
                    ba.a.a.a = false;
                    if (ah.g == 1) {
                        ba.a.a.e();
                        break;
                    }
                    if (ah.g == 0) {
                        bg.a();
                        ba.a.d(0);
                        break;
                    }
                    ** GOTO lbl345
lbl205:
                    // 1 sources

                    if (var0 == 2) {
                        if (ba.a.a.d == 1) {
                            ba.a.a.e = 1;
                            break;
                        }
                        ba.a.a.g();
                        break;
                    }
                    if (var0 == 5) {
                        if (ba.a.a.d == 1) {
                            ba.a.a.e = 0;
                            break;
                        }
                        ba.a.a.f();
                        break;
                    }
                    if (var0 == 1) {
                        var0 = ah.t >= ah.A ? 1 : 0;
                        var1_14 = ah.t < ah.A + ah.z;
                        v1 = var2_24 = ah.A > 0;
                        if (var0 != 0 && var1_14 && var2_24) {
                            ah.A = (byte)(ah.A - ah.z);
                            ah.d = false;
                        }
                        if ((ah.t = (byte)(ah.t - ah.z)) >= 0) break;
                        ah.t = (byte)(ah.t + ah.z);
                        break;
                    }
                    if (var0 != 6) ** GOTO lbl345
                    v2 = (byte)(ah.a + ah.b + ah.c);
                    var0 = v2;
                    var1_15 = (byte)(v2 - 1);
                    if (var1_15 - ah.t < ah.z) ** GOTO lbl239
                    var2_25 = ah.t >= ah.A + 3 * ah.z;
                    v3 = var0 = ah.t < ah.A + 4 * ah.z ? 1 : 0;
                    if (var2_25 && var0 != 0) {
                        ah.A = (byte)(ah.A + ah.z);
                    }
                    if (var1_15 / ah.z == (ah.t = (byte)(ah.t + ah.z)) / ah.z) {
                        ah.d = true;
                    }
                    ** GOTO lbl345
lbl239:
                    // 1 sources

                    if (ah.t >= var1_15) break;
                    if (ah.t + ah.z >= ah.z << 2 && var1_15 / ah.z > ah.t / ah.z && !ah.d) {
                        ah.A = (byte)(ah.A + ah.z);
                        ah.d = true;
                    }
                    ah.t = var1_15;
                    break;
lbl245:
                    // 1 sources

                    if (ba.a.a.i != 6) ** GOTO lbl337
                    if (var0 != 8) ** GOTO lbl321
                    ba.a.a.a = false;
                    var0 = ah.b;
                    var1_16 = ah.a;
                    var2_26 = ah.c;
                    if (ah.t < var0) {
                        System.out.println("SystemBoard.goodsIndex=" + ah.t);
                        if (ba.a.a.v == 0) {
                            if (s.a == null || s.a[ah.t][1] <= 0 || s.a[ah.t][0] > s.g.length) break;
                            if (s.f[s.a[ah.t][0] - 1] == 1) {
                                if (s.h[s.a[ah.t][0] - 1] == 1) {
                                    ba.a.a.a = new byte[]{0};
                                } else {
                                    ba.a.a.a = new byte[ah.a.length];
                                    for (var0 = 0; var0 < ba.a.a.a.length; ++var0) {
                                        ba.a.a.a[var0] = (byte)var0;
                                    }
                                }
                                ba.a.a.d();
                            } else if (s.f[s.a[ah.t][0] - 1] == 2) {
                                if (s.h[s.a[ah.t][0] - 1] != 1) break;
                                ba.a.a.a = new byte[]{0};
                                if (s.a[ah.t][0] == 31) {
                                    ah.j = true;
                                    ba.a.a("\u4e60\u5f97--\u51cc\u6ce2\u5fae\u6b65", (short)40);
                                    s.b = true;
                                    ba.a.a.i = (byte)7;
                                    s.e = w.b(s.e, (int)s.a[ah.t][0]);
                                    s.a(s.a[ah.t][0]);
                                } else {
                                    ba.a.a.d();
                                }
                            } else {
                                if (s.f[s.a[ah.t][0] - 1] != 3) break;
                                if (s.a[ah.t][0] == 29) {
                                    ah.f = true;
                                } else {
                                    ah.g = true;
                                }
                                ba.a.a.i = (byte)7;
                            }
                        } else {
                            if (ba.a.a.v != 1) break;
                            ah.h = s.a[ah.t][0] == 29;
                            if (!ah.h) {
                                s.a(s.a[ah.t][0]);
                                ba.a.a.v = 0;
                                ba.a.a.i = (byte)5;
                                ah.t = 0;
                                ah.A = 0;
                            } else {
                                ba.a.a.i = (byte)7;
                            }
                        }
                    } else if (ah.t < var1_16 + var0) {
                        if (ba.a.a.v != 0) break;
                        var0_3 = s.a(ah.t - ah.b);
                        var1_16 = (byte)var0_3[0];
                        ah.i = s.a[var1_16][var0_4 = (byte)var0_3[1]] == 73 || s.a[var1_16][var0_4] == 74;
                        if (!ah.i) {
                            s.f(var1_16, var0_4);
                            ba.a.a.v = 0;
                            ba.a.a.i = (byte)5;
                            ah.t = 0;
                            ah.A = 0;
                            break;
                        }
                        ba.a.a.i = (byte)7;
                    } else {
                        if (ah.t >= var1_16 + var0 + var2_26 || ba.a.a.v != 0) break;
                        var0_5 = s.b(ah.t - var0 - var1_16);
                        var1_16 = (byte)var0_5[0];
                        var0_6 = (byte)var0_5[1];
                        var0_6 = s.a[var1_16][var0_6][0];
                        s.b((int)var0_6);
                        ba.a.a.v = 0;
                        ba.a.a.i = (byte)5;
                        ah.t = 0;
                        ah.A = 0;
                        break;
lbl321:
                        // 1 sources

                        if (var0 == af.g) {
                            ba.a.a.a = false;
                            ba.a.a.i = (byte)5;
                            break;
                        }
                        if (var0 == 1) {
                            ba.a.a.v = (byte)(ba.a.a.v - 1);
                            if (ba.a.a.v < 0) {
                                ba.a.a.v = (byte)(ba.a.a.w - 1);
                                break;
                            }
                        } else if (var0 == 6) {
                            ba.a.a.v = (byte)(ba.a.a.v + 1);
                            if (ba.a.a.v > ba.a.a.w - 1) {
                                ba.a.a.v = 0;
                                break;
                            }
                        }
                    }
                    ** GOTO lbl345
lbl337:
                    // 1 sources

                    if (ba.a.a.i == 7 && var0 == af.g) {
                        ba.a.a.a = false;
                        ba.a.a.i = (byte)5;
                        ah.f = false;
                        ah.g = false;
                        ah.h = false;
                        ah.i = false;
                        ah.j = false;
                    }
lbl345:
                    // 17 sources

                    return;
                }
                case 7: {
                    ba.a.a.a = false;
                    if (var0 == 8) {
                        if (s.a == null) break;
                        var0_7 = new Vector<g>();
                        for (var1_17 = 0; ba.a.a.a != null && var1_17 < ba.a.a.a.length; ++var1_17) {
                            var0_7.addElement(ah.a[ba.a.a.a[var1_17]]);
                        }
                        var1_18 = null;
                        if (var0_7.size() > 0) {
                            var1_18 = new g[var0_7.size()];
                            var0_7.copyInto(var1_18);
                        }
                        ah.a((g[])var1_18, s.a[ah.t][0]);
                        ba.a.a.d();
                        return;
                    }
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        ba.a.a.e();
                        return;
                    }
                    if (var0 == 1) {
                        if (ba.a.a.a == null || ba.a.a.a.length != 1 || ba.a.a.a[0] <= 0) break;
                        ba.a.a.a[0] = (byte)(ba.a.a.a[0] - 1);
                        return;
                    }
                    if (var0 != 6 || ba.a.a.a == null || ba.a.a.a.length != 1 || ba.a.a.a[0] >= ah.a.length - 1) break;
                    ba.a.a.a[0] = (byte)(ba.a.a.a[0] + 1);
                    return;
                }
                case 8: {
                    ah.j();
                    ba.a.a.k = false;
                    if (ba.a.a.i == 8) {
                        if (var0 == 8) {
                            ba.a.a.a = false;
                            ba.a.a.i = (byte)9;
                            return;
                        }
                        if (var0 == af.g) {
                            ba.a.a.a = false;
                            ba.a.a.e();
                            return;
                        }
                        if (var0 == 2) {
                            ba.a.a.g();
                            return;
                        }
                        if (var0 != 5) break;
                        ba.a.a.f();
                        return;
                    }
                    if (ba.a.a.i == 9) {
                        if (var0 == 8) {
                            ba.a.a.a = false;
                            ba.a.a.i = (byte)10;
                            ah.M = (byte)-1;
                            return;
                        }
                        if (var0 == af.g) {
                            ba.a.a.a = false;
                            ba.a.a.i = (byte)8;
                            ah.l = 0;
                            return;
                        }
                        if (var0 == 1) {
                            if (ah.a[ah.r].b == null) break;
                            if (ah.l >= 5) {
                                if ((ah.l = (byte)(ah.l + 1)) <= 7) break;
                                ah.l = (byte)7;
                                return;
                            }
                            if (ah.l > 2 || (ah.l = (byte)(ah.l - 1)) >= 0) break;
                            ah.l = 0;
                            return;
                        }
                        if (var0 == 6) {
                            if (ah.a[ah.r].b == null) break;
                            if (ah.l >= 5) {
                                if ((ah.l = (byte)(ah.l - 1)) > 5) break;
                                ah.l = (byte)5;
                                return;
                            }
                            if (ah.l > 2 || (ah.l = (byte)(ah.l + 1)) <= 2) break;
                            ah.l = (byte)2;
                            return;
                        }
                        if (var0 == 2) {
                            ba.a.a.g();
                            return;
                        }
                        if (var0 != 5) break;
                        ba.a.a.f();
                        return;
                    }
                    if (ba.a.a.i != 10) break;
                    if (var0 == 8) {
                        var0_8 = ba.a;
                        synchronized (var0_8) {
                            ba.a.a.a = false;
                            System.out.println("\u6362\u88c5\u5907----------");
                            if (ah.a[ah.r].b == null) {
                                ah.a[ah.r].b = new byte[8];
                            }
                            if ((ah.m = (byte)(ah.M + 1)) == 0) {
                                ba.a.a.h();
                                ba.a.a.i = (byte)9;
                                ah.L = (byte)-1;
                                ah.M = (byte)-1;
                            } else if (ah.m > 0) {
                                var1_19 = z.a(ah.a[ah.r], s.a[ah.l][ah.m - 1]);
                                if (var1_19) {
                                    ba.a.a.h();
                                    ba.a.a.i = (byte)9;
                                    ah.L = (byte)-1;
                                    ah.M = (byte)-1;
                                } else if (ah.a[ah.r].m <= 0) {
                                    ba.a.c("\u5f53\u524d\u80fd\u529b\u4e0d\u80fd\u88c5\u5907.[\u53cb\u60c5\u63d0\u793a\uff1a\u53ef\u4ee5\u5230\u201d\u8d34\u5fc3\u670d\u52a1\u201c\u7834\u89e3\u8c79\u80ce\u6613\u7b4b\u4e38\uff0c\u4f7f\u7528\u836f\u4e38\u540e\u53ef\u4ee5\u83b7\u5f97\u4e00\u6b21\u5f3a\u884c\u88c5\u5907\u673a\u4f1a]", (short)80);
                                } else if (ah.a[ah.r].m > 0 && ah.a[ah.r].l == 0) {
                                    ba.a.c("\u4f60\u67091\u6b21\u5f3a\u884c\u7a7f\u4e0a\u672c\u88c5\u5907\u7684\u673a\u4f1a\uff0c\u518d\u6b21\u786e\u5b9a\u5c06\u5f3a\u884c\u88c5\u5907\u672c\u88c5\u5907", (short)180);
                                    ah.a[ah.r].l = 1;
                                } else if (ah.a[ah.r].m > 0 && ah.a[ah.r].l == 1) {
                                    ba.a.a.h();
                                    ba.a.a.i = (byte)9;
                                    ah.L = (byte)-1;
                                    ah.M = (byte)-1;
                                    ah.a[ah.r].m = (short)(ah.a[ah.r].m - 1);
                                }
                            }
                            break;
                        }
                    }
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        ba.a.a.i = (byte)9;
                        ah.L = (byte)-1;
                        ah.M = (byte)-1;
                        ah.a[ah.r].l = 0;
                        return;
                    }
                    if (var0 == 2) {
                        ba.a.a.g();
                        ah.a[ah.r].l = 0;
                        return;
                    }
                    if (var0 != 5) break;
                    ba.a.a.f();
                    ah.a[ah.r].l = 0;
                    return;
                }
                case 16: {
                    ah.j();
                    if (ah.h == 0) {
                        if (var0 == 8) {
                            if (ba.a.a.c == null) break;
                            ah.h = 1;
                            return;
                        }
                        if (var0 == af.g) {
                            ba.a.a.e();
                            return;
                        }
                        if (var0 == 1) {
                            if (ba.a.a.c == null) break;
                            if (ah.x > ah.N - 1) {
                                ah.y = (byte)(ah.y - 1);
                            }
                            if (ah.x <= 0) break;
                            ah.x = (byte)(ah.x - 1);
                            return;
                        }
                        if (var0 != 6 || ba.a.a.c == null) break;
                        var0 = (byte)ba.a.a.c.length;
                        if (ah.x < var0 - 1) {
                            if (ah.x >= ah.N - 1) {
                                ah.y = (byte)(ah.y + 1);
                            }
                            ah.x = (byte)(ah.x + 1);
                        }
                        return;
                    }
                    if (ah.h != 1 || var0 != af.g) break;
                    ah.h = 0;
                    return;
                }
                case 9: {
                    if (var0 == 8) {
                        ba.a.a.a = false;
                        if (ba.a.a.b == 3) {
                            if (u.b || ba.a.a.o == 0) {
                                s.g = true;
                                v4 = ba.a.a.o;
                                var0 = v4;
                                s.a(v4);
                                s.b((byte)var0);
                                ba.a.a.s = (byte)8;
                                ba.a.a.c = true;
                                return;
                            }
                            var0_9 = "\u53cb\u60c5\u63d0\u793a\uff1a\u672c\u5b58\u6863\u4e3a\u9644\u52a0\u5b58\u6863,\u5148\u5230\u201d\u8d34\u5fc3\u670d\u52a1\u201c\u5f00\u901a\u624d\u80fd\u4f7f\u7528!";
                            ba.a.c(var0_9, (short)120);
                            return;
                        }
                        if (ba.a.a.a[ba.a.a.n].equals("\u50a8\u5b58\u8fdb\u5ea6")) {
                            ba.a.a.b = (byte)3;
                            var0_10 = RecordStore.listRecordStores();
                            System.out.println("\u5b58\u68632\uff1a" + w.a(var0_10));
                            for (var1_21 = 0; var0_10 != null && var1_21 < var0_10.length; ++var1_21) {
                                if (!var0_10[var1_21].equals(s.h)) continue;
                                s.g = true;
                                s.a();
                            }
                            return;
                        }
                        if (ba.a.a.a[ba.a.a.n].equals("\u97f3\u4e50\u5f00\u5173")) {
                            v5 = GameMIDlet.self.playMusic = GameMIDlet.self.playMusic == false;
                            if (GameMIDlet.self.playMusic) {
                                ba.a.i();
                                return;
                            }
                            ba.a.j();
                            return;
                        }
                        if (ba.a.a.a[ba.a.a.n].equals("\u5236\u4f5c\u4eba\u5458")) {
                            ba.a.a.b = 1;
                            return;
                        }
                        if (ba.a.a.a[ba.a.a.n].equals("\u7248\u672c\u8bf4\u660e")) {
                            ba.a.a.b = (byte)2;
                            return;
                        }
                        if (!ba.a.a.a[ba.a.a.n].equals("\u79bb\u5f00\u6e38\u620f")) break;
                        ba.a.b = 0;
                        ba.a.a = null;
                        System.gc();
                        try {
                            Thread.sleep(300L);
                        }
                        catch (InterruptedException v6) {
                            var0_11 = v6;
                            v6.printStackTrace();
                        }
                        if (ba.a != null) {
                            ba.a.j();
                        }
                        GameMIDlet.self.showCover();
                        s.j();
                        return;
                    }
                    if (var0 == af.g) {
                        ba.a.a.a = false;
                        s.g = false;
                        if (ba.a.a.b == 1 || ba.a.a.b == 2 || ba.a.a.b == 3) {
                            ba.a.a.b = 0;
                            return;
                        }
                        ba.a.a.e();
                        return;
                    }
                    if (var0 == 1) {
                        if (ba.a.a.b == 3) {
                            if (ba.a.a.o <= 0) break;
                            ba.a.a.o = (byte)(ba.a.a.o - 1);
                            return;
                        }
                        if (ba.a.a.n <= 0) break;
                        ba.a.a.n = (byte)(ba.a.a.n - 1);
                        return;
                    }
                    if (var0 != 6) break;
                    if (ba.a.a.b == 3) {
                        if (ba.a.a.o >= ba.a.a.b.length - 1) break;
                        ba.a.a.o = (byte)(ba.a.a.o + 1);
                        return;
                    }
                    if (ba.a.a.n >= ba.a.a.a.length - 1) break;
                    ba.a.a.n = (byte)(ba.a.a.n + 1);
                    return;
                }
                case 10: {
                    ah.j();
                    if (ba.a.a.d == 0) {
                        if (var0 == 8) {
                            if (ba.a.a.a != null && ba.a.a.q * ba.a.a.a[ah.P + ah.Q][1] > 0) {
                                ba.a.a.d = 1;
                                break;
                            }
                        } else {
                            if (var0 == af.g) {
                                bg.a();
                                ba.a.d(0);
                                break;
                            }
                            if (var0 == 1) {
                                if (ba.a.a.a != null) {
                                    if (ah.Q > 0) {
                                        ah.Q = (byte)(ah.Q - 1);
                                        ba.a.a.q = 0;
                                        break;
                                    }
                                    if (ah.Q == 0 && ah.P > 0) {
                                        ah.P = (byte)(ah.P - 1);
                                        ba.a.a.q = 0;
                                        break;
                                    }
                                }
                            } else if (var0 == 6) {
                                if (ba.a.a.a != null) {
                                    if (ah.Q < ah.O - 1) {
                                        if (ah.P + ah.Q < ba.a.a.a.length - 1) {
                                            ah.Q = (byte)(ah.Q + 1);
                                            ba.a.a.q = 0;
                                            break;
                                        }
                                    } else if (ah.Q == ah.O - 1 && ah.P + ah.Q < ba.a.a.a.length - 1) {
                                        ah.P = (byte)(ah.P + 1);
                                        ba.a.a.q = 0;
                                        break;
                                    }
                                }
                            } else if (var0 == 2) {
                                if (ba.a.a.a != null && ba.a.a.q > 0) {
                                    ba.a.a.q = (byte)(ba.a.a.q - 1);
                                    break;
                                }
                            } else if (var0 == 5 && ba.a.a.a != null) {
                                if (ba.a.a.c == 1) {
                                    if ((ba.a.a.q + 1) * ba.a.a.a[ah.P + ah.Q][1] <= s.a && ba.a.a.q <= 8) {
                                        ba.a.a.q = (byte)(ba.a.a.q + 1);
                                        break;
                                    }
                                } else if (ba.a.a.c == 3 && (ba.a.a.q + 1) * ba.a.a.a[ah.P + ah.Q][1] <= s.a && ba.a.a.q <= 8) {
                                    ba.a.a.q = (byte)(ba.a.a.q + 1);
                                    break;
                                }
                            }
                        }
                    } else if (ba.a.a.d == 1 && ba.a.a.a != null) {
                        if (var0 == 8) {
                            if (ba.a.a.e == 1) {
                                if (ba.a.a.c == 1 || ba.a.a.c == 3) {
                                    ba.a.a.i();
                                }
                                ba.a.a.d = 0;
                                ba.a.a.e = 0;
                                break;
                            }
                            ba.a.a.d = 0;
                            break;
                        }
                        if (var0 == af.g) {
                            ba.a.a.d = 0;
                            break;
                        }
                        if (var0 == 2) {
                            ba.a.a.e = 1;
                            break;
                        }
                        if (var0 == 5) {
                            ba.a.a.e = 0;
                        }
                    }
                    return;
                }
                case 13: {
                    ba.a.a.k = false;
                    bg.b(var0, 2);
                    return;
                }
                case 14: {
                    ba.a.a.k = false;
                    bg.b(var0, 0);
                    return;
                }
                case 15: {
                    ba.a.a.k = false;
                    bg.b(var0, 1);
                }
            }
        }
    }

    private static boolean a() {
        t.m = true;
        ba.a.a = null;
        System.gc();
        ba.a.m();
        t.g();
        ba.a.a = 0;
        ba.a.b = 0;
        n.a(1);
        System.gc();
        try {
            Thread.sleep(30L);
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
        }
        ba.a.b = 1;
        return true;
    }

    public static void a(int n2, int n3) {
        ad ad2;
        if (ba.a.a == 2 && ba.a.b == 3 && (ad2 = n.a(n2, n3)) != null) {
            if (ad2.a == 3) {
                bg.a();
                ba.a.d(0);
                n.a(1);
                return;
            }
            if (ad2.a == 2) {
                switch (ba.a.a.a) {
                    case 8: {
                        if (ba.a.a.i == 10) {
                            ba.a.a.i = (byte)9;
                            return;
                        }
                        ba.a.a.e();
                        return;
                    }
                    case 9: {
                        if (ba.a.a.b == 1 || ba.a.a.b == 2 || ba.a.a.b == 3) {
                            ba.a.a.b = 0;
                            return;
                        }
                        ba.a.a.e();
                        return;
                    }
                }
                ba.a.a.e();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void b(int n2, int n3) {
        int n4 = -1;
        switch (n3) {
            case 0: {
                n4 = 0;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
        }
        if (ah.a == null || s.a[n4] == null && ah.b[0] == 0 && ah.b[1] == 0 && ah.b[2] == 0) {
            if (n2 != af.g) return;
            ba.a.a.a = false;
            bg.a();
            ba.a.d(0);
            return;
        }
        ah.j();
        if (ba.a.a.f != 0) {
            if (ba.a.a.f != 1) return;
            if (n2 != af.g) return;
            ah.j();
            ba.a.a.a = false;
            ah.a[0] = -3;
            ah.a[1] = 0;
            ah.a[2] = 0;
            ah.a[3] = 0;
            ba.a.a.f = 0;
            return;
        }
        if (n2 == 8) {
            ba.a.a.a = false;
            block5 : switch (ba.a.a.D) {
                case 0: {
                    ah.a = new z();
                    ah.a = ah.a[ah.B + ah.E];
                    System.out.println("1-------\u8981\u5347\u7ea7\u7684\u88c5\u5907\u5df2\u7ecf\u9009\u597d");
                    ba.a.a.D = (byte)(ba.a.a.D + 1);
                    return;
                }
                case 1: {
                    n2 = 0;
                    while (n2 < ah.b.length) {
                        if (ah.b[n2] == 0 && s.a[n4] != null) {
                            ah.b[n2] = s.a[n4][ah.C + ah.F][0];
                            s.d(s.a[n4][ah.C + ah.F][0], 1);
                            if (ah.F > 0) {
                                ah.F = (byte)(ah.F - 1);
                                break block5;
                            }
                            if (ah.F != 0) return;
                            if (ah.C > 0) {
                                ah.C = (byte)(ah.C - 1);
                                break block5;
                            }
                            if (ah.C != 0) return;
                            break block5;
                        }
                        ++n2;
                    }
                    return;
                }
                case 2: {
                    if (ah.b[ah.G] <= 0) return;
                    s.b(ah.b[ah.G], 1);
                    ah.b[ah.G] = 0;
                }
            }
            return;
        }
        if (n2 == af.f) {
            if (ba.a.a.D == 0) {
                System.out.println("\u8bf7\u9009\u62e9\u4f60\u8981\u5347\u7ea7\u7684\u88c5\u5907\uff01");
                return;
            }
            ah.a = z.a(ah.a, ah.b);
            switch (ah.a[0]) {
                case -2: {
                    System.out.println("\u5347\u7ea7\u6b21\u6570\u5df2\u6ee1");
                    break;
                }
                case -1: {
                    System.out.println("\u6750\u6599\u4e0d\u8db3");
                    break;
                }
                case 0: {
                    System.out.println("\u5347\u7ea7\u5931\u8d25");
                    break;
                }
                case 1: {
                    System.out.println("\u5347\u7ea7\u6210\u529f");
                    break;
                }
            }
            ba.a.a.f = 1;
            return;
        }
        if (n2 == af.g) {
            ba.a.a.a = false;
            bg.a();
            ba.a.d(0);
            return;
        }
        if (n2 == 1) {
            if (ba.a.a.D == 0) {
                ah.a = new z();
                ah.a = ah.a[ah.B + ah.E];
                System.out.println("up-------\u8981\u5347\u7ea7\u7684\u88c5\u5907\u5df2\u7ecf\u9009\u597d");
            }
            ba.a.a.D = (byte)((ba.a.a.D = (byte)(ba.a.a.D - 1)) < 0 ? 2 : (int)ba.a.a.D);
            return;
        }
        if (n2 == 6) {
            if (ba.a.a.D == 0) {
                ah.a = new z();
                ah.a = ah.a[ah.B + ah.E];
                System.out.println("down-------\u8981\u5347\u7ea7\u7684\u88c5\u5907\u5df2\u7ecf\u9009\u597d");
            }
            ba.a.a.D = (ba.a.a.D = (byte)(ba.a.a.D + 1)) > 2 ? (byte)0 : ba.a.a.D;
            return;
        }
        if (n2 == 2) {
            switch (ba.a.a.D) {
                case 0: {
                    if (ah.B == 0) {
                        if ((ah.E = (byte)(ah.E - 1)) >= 0) return;
                        ah.E = 0;
                        return;
                    }
                    if (ah.B <= 0) return;
                    if ((ah.E = (byte)(ah.E - 1)) >= 0) return;
                    ah.E = 0;
                    ah.B = (byte)(ah.B - 1);
                    return;
                }
                case 1: {
                    if (ah.C == 0) {
                        if ((ah.F = (byte)(ah.F - 1)) < 0) {
                            ah.F = 0;
                        }
                    } else if (ah.C > 0 && (ah.F = (byte)(ah.F - 1)) < 0) {
                        ah.F = 0;
                        ah.C = (byte)(ah.C - 1);
                    }
                    System.out.println("firstStonePos=" + ah.C);
                    System.out.println("stoneChooseIndex=" + ah.F);
                    return;
                }
                case 2: {
                    ah.G = (byte)(ah.G - 1);
                    ah.G = (byte)(ah.G < 0 ? 2 : (int)ah.G);
                }
            }
            return;
        }
        if (n2 != 5) return;
        switch (ba.a.a.D) {
            case 0: {
                n2 = (byte)ah.a.length;
                if (ah.B + ah.E >= n2 - 1) return;
                if (ah.E != 2) {
                    if (ah.B >= 2) return;
                    ah.E = (byte)(ah.E + 1);
                    return;
                }
                ah.B = (byte)(ah.B + 1);
                break;
            }
            case 1: {
                n2 = (byte)s.a[n4].length;
                if (ah.C + ah.F < n2 - 1) {
                    if (ah.F == 2) {
                        ah.C = (byte)(ah.C + 1);
                    } else if (ah.F < 2) {
                        ah.F = (byte)(ah.F + 1);
                    }
                }
                System.out.println("firstStonePos=" + ah.C);
                System.out.println("stoneChooseIndex=" + ah.F);
                return;
            }
            case 2: {
                ah.G = (byte)(ah.G + 1);
                ah.G = ah.G > 2 ? (byte)0 : ah.G;
            }
        }
    }
}
