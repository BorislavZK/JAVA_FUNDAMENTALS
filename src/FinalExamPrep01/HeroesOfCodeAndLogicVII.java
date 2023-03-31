package FinalExamPrep01;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{hero name} {HP} {MP}"
            String heroesData = scan.nextLine();

            String currentHeroName = heroesData.split(" ")[0];
            int currentHitPoint = Integer.parseInt(heroesData.split(" ")[1]);
            int currentManaPoints = Integer.parseInt(heroesData.split(" ")[2]);

            heroesMap.putIfAbsent(currentHeroName, new ArrayList<>());
            heroesMap.get(currentHeroName).add(currentHitPoint); // HitPoint 0 position on list
            heroesMap.get(currentHeroName).add(currentManaPoints); // MANA 1 position on list
        }
        String commands = scan.nextLine();

        while (!commands.equals("End")) {
            //CastSpell – {hero name} – {MP needed} – {spell name}"
            if (commands.contains("CastSpell")) {
                String heroName = commands.split(" - ")[1];
                int manaNeeded = Integer.parseInt(commands.split(" - ")[2]);
                String spellName = commands.split(" - ")[3];

                int currentMana = heroesMap.get(heroName).get(1);

                if (currentMana >= manaNeeded) {
                    currentMana -= manaNeeded;
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, currentMana );
                    heroesMap.get(heroName).set(1, currentMana);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                }

            } else if (commands.contains("TakeDamage")) {
                //"TakeDamage – {hero name} – {damage} – {attacker}"

                String heroName = commands.split(" - ")[1];
                int damage = Integer.parseInt(commands.split(" - ")[2]);
                String attacker = commands.split(" - ")[3];

                int currentHitPoint = heroesMap.get(heroName).get(0);

                if (currentHitPoint > 0) {
                    currentHitPoint -= damage;

                    if (currentHitPoint <= 0) {
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        heroesMap.remove(heroName);
                    } else {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, currentHitPoint);
                        heroesMap.get(heroName).set(0, currentHitPoint);
                    }
                }
            } else if (commands.contains("Recharge")) { //OK
                //Recharge – {hero name} – {amount}"

                String heroName = commands.split(" - ")[1];
                int amount = Integer.parseInt(commands.split(" - ")[2]);

                int currentMana = heroesMap.get(heroName).get(1);
                int manaToRefill = 0;
                if (currentMana < 200) {
                    int emptySpace = 200 - currentMana;
                    if (amount > emptySpace) {
                        manaToRefill = emptySpace;
                    } else {
                        manaToRefill = amount;
                    }

                    currentMana += manaToRefill;
                    heroesMap.get(heroName).set(1, currentMana);
                }

                System.out.printf("%s recharged for %d MP!\n", heroName, manaToRefill);

            } else if (commands.contains("Heal")) { // OK
                //Heal – {hero name} – {amount}"
                String heroName = commands.split(" - ")[1];
                int amount = Integer.parseInt(commands.split(" - ")[2]);
                int currentHeal = heroesMap.get(heroName).get(0);
                int healToRefill = 0;

                if (currentHeal < 100) {
                    int emptySpace = 100 - currentHeal;
                    if (amount > emptySpace) {
                        healToRefill = emptySpace;
                    } else {
                        healToRefill = amount;
                    }

                    currentHeal += healToRefill;
                    heroesMap.get(heroName).set(0, currentHeal);
                }

                System.out.printf("%s healed for %d HP!\n", heroName, healToRefill);

            }


            commands = scan.nextLine();

        }


        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            System.out.printf("%s\n", entry.getKey());
            System.out.printf("  HP: %d\n", entry.getValue().get(0));
            System.out.printf("  MP: %d\n", entry.getValue().get(1));
        }
    }
}
