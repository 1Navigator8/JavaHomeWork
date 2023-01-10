package org.example._02_01_23;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data

public class HW0712 {

    public static class Character {
        String race;
        String name;

        public Character(String race, String name) {
            this.race = race;
            this.name = name;
        }


    }

    public static class Level {
        int thelevel;

        public Level(int thelevel) {
            this.thelevel = thelevel;
        }
    }


    public static void main(String[] args) {

        Level lv1 = new Level(10);
        Level lv2 = new Level(20);
        Level lv3 = new Level(30);
        Level lv4 = new Level(40);
        Level lv5 = new Level(50);
        Level lv6 = new Level(60);
        Level lv7 = new Level(70);
        Level lv8 = new Level(80);
        Level lv9 = new Level(90);
        Level lv10 = new Level(99);
        Character character1 = new Character("Goblin ", "Val");
        Character character2 = new Character("Warrior ", "Gal");
        Character character3 = new Character("Adventurers ", "Bell");
        Character character4 = new Character("Thief ", "Ida");
        Character character5 = new Character("Hobbits ", "Loni");
        Character character6 = new Character("Orc ", "Gurn");
        Character character7 = new Character("Wizard ", "Artur");
        Character character8 = new Character("Dwarf ", "Willi");
        Character character9 = new Character("Archer ", "Sela");
        Character character10 = new Character("Elf ", "Andra");

        Map<Integer, String> mapCharacter = new HashMap<>();
        mapCharacter.put(lv1.thelevel, character1.race);
        mapCharacter.put(lv2.thelevel, character2.race);
        mapCharacter.put(lv3.thelevel, character3.race);
        mapCharacter.put(lv4.thelevel, character4.race);
        mapCharacter.put(lv5.thelevel, character5.race);
        mapCharacter.put(lv6.thelevel, character6.race);
        mapCharacter.put(lv7.thelevel, character7.race);
        mapCharacter.put(lv8.thelevel, character8.race);
        mapCharacter.put(lv9.thelevel, character9.race);
        mapCharacter.put(lv10.thelevel, character10.race);

        System.out.println(mapCharacter);
        System.out.println(mapCharacter.containsValue("Orc"));
        System.out.println(mapCharacter.containsKey(60));
        System.out.println(mapCharacter.isEmpty());
        System.out.println(mapCharacter.size());

        Map<Integer, String> mapCharacterClone = new HashMap<>();
        mapCharacterClone.putAll(mapCharacter);
        System.out.println(mapCharacterClone);

        System.out.println(mapCharacter.equals(mapCharacterClone));
        System.out.println(mapCharacter.get("Wizard"));
        mapCharacter.putIfAbsent(55, "Fairy");
        System.out.println(mapCharacter + " " + mapCharacter.size());
        mapCharacter.remove(60);
        System.out.println(mapCharacter + " " + mapCharacter.size());

        Set<Integer> key = mapCharacter.keySet();
        System.out.println(key);
        Collection<String> val = mapCharacter.values();
        System.out.println(val);
        for (Map.Entry<Integer, String> item : mapCharacter.entrySet()) {
            System.out.printf(" Key: %d, Value: %s \n", item.getKey(), item.getValue());
        }

    }
}

