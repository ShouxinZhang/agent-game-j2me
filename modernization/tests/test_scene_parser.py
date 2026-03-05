from __future__ import annotations

from pathlib import Path

from data_loader.loader import load_scene_event_by_id


TXT_ROOT = Path(__file__).resolve().parents[2] / "work" / "unpacked" / "txt"


def test_scene1_parse_basic() -> None:
    scene1 = load_scene_event_by_id(TXT_ROOT, 1)
    assert scene1.scene_id == 1
    assert scene1.scene_name == "世界地图"
    assert scene1.declared_event_amount == 24
    assert len(scene1.events) == 23
    assert scene1.get_event(1).name == "进村"
    assert scene1.get_event(24).name == "试练宫"


def test_scene2_parse_basic() -> None:
    scene2 = load_scene_event_by_id(TXT_ROOT, 2)
    assert scene2.scene_id == 2
    assert scene2.scene_name == "村庄"
    assert scene2.declared_event_amount == 9
    assert len(scene2.events) == 9
    assert scene2.get_event(8).name == "送MM"
