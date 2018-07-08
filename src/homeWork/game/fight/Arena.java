package homeWork.game.fight;

import homeWork.game.warriors.*;
import homeWork.game.weapon.*;

import java.util.Scanner;

public final class Arena {

    public Arena() {
    }

    private static final Arena FIGHT;

    private Gladiator archer = new Archer();
    private Gladiator hunter = new Hunter();
    private Gladiator paladin = new Paladin();
    private Gladiator assasin = new Assassin();

    private WeaponWarrior[] weaponWarriors = new WeaponWarrior[]{new Arbalest(), new Axe(), new Mace(), new Knife(), new Spear()};
    private Gladiator[] gladiators = new Gladiator[]{new Archer(), new Assassin(), new Hunter(), new Paladin()};

    private Scanner scanner = new Scanner(System.in);

    static {
        FIGHT = new Arena();
    }

    public static Arena getFight() {
        return FIGHT;
    }

    public void start() {
        System.out.println(" ****Are you ready for the battle?**** ");
        System.out.println(" Exactly? ");
        System.out.println(" >1.YES\n >2.NO ");
        int sc = scanner.nextInt();
        if (sc == 1) {
            System.out.println();
            System.out.println(" Сhoose warrior ");
            System.out.println(">1.Archer\n>2.Hunter\n>3.Assassin\n>4.Paladin ");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Greetings to you in the game! Your warrior is an archer");
                System.out.println();
                Gladiator gladiator = gladiators[(int) (Math.random() * 4)];
                System.out.println("The health of your warrior(Archer) - " + archer.getHealth());
                System.out.println("The health of your adversary - " + gladiator.getHealth());
                System.out.println();
                while (archer.getHealth() > 0) {
                    WeaponWarrior weaponWarriorForArcher = weaponWarriors[(int) (Math.random() * 5)];
                    archer.changeWeapon(weaponWarriorForArcher);

                    WeaponWarrior weaponWarriorForAdversary = weaponWarriors[(int) (Math.random() * 5)];
                    gladiator.changeWeapon(weaponWarriorForAdversary);

                    archer.protection(gladiator.attack());
                    gladiator.protection(archer.attack());


                    System.out.println("The health of your warrior after the strike - " + archer.getHealth());
                    System.out.println("The health adversary after the strike - " + gladiator.getHealth());


                    if (archer.getHealth() <= 0) {
                        System.out.println("<<< You LOSE :( >>>");
                        break;
                    } else if (gladiator.getHealth() <= 0) {
                        System.out.println("<<< You WIN :) >>>");
                        break;
                    }
                }
            }
            if (num == 2) {
                System.out.println("Greetings to you in the game! Your warrior is an hunter");
                System.out.println();
                Gladiator gladiator = gladiators[(int) (Math.random() * 4)];
                System.out.println("The health of your warrior(Hunter) - " + hunter.getHealth());
                System.out.println("The health of your adversary - " + gladiator.getHealth());
                System.out.println();
                while (hunter.getHealth() > 0) {
                    WeaponWarrior weaponWarriorForHunter = weaponWarriors[(int) (Math.random() * 5)];
                    hunter.changeWeapon(weaponWarriorForHunter);

                    WeaponWarrior weaponWarriorForAdversary = weaponWarriors[(int) (Math.random() * 5)];
                    gladiator.changeWeapon(weaponWarriorForAdversary);

                    hunter.protection(gladiator.attack());
                    gladiator.protection(hunter.attack());


                    System.out.println("The health of your warrior after the strike - " + hunter.getHealth());
                    System.out.println("The health adversary after the strike - " + gladiator.getHealth());


                    if (hunter.getHealth() <= 0) {
                        System.out.println("<<< You LOSE :( >>>");
                        break;
                    } else if (gladiator.getHealth() <= 0) {
                        System.out.println("<<< You WIN :) >>>");
                        break;
                    }

                }
            }
            if (num == 3) {
                System.out.println("Greetings to you in the game! Your warrior is an assassin");
                System.out.println();
                Gladiator gladiator = gladiators[(int) (Math.random() * 4)];
                System.out.println("The health of your warrior(Hunter) - " + assasin.getHealth());
                System.out.println("The health of your adversary - " + gladiator.getHealth());
                System.out.println();
                while (assasin.getHealth() > 0) {
                    WeaponWarrior weaponWarriorForAssasin = weaponWarriors[(int) (Math.random() * 5)];
                    assasin.changeWeapon(weaponWarriorForAssasin);

                    WeaponWarrior weaponWarriorForAdversary = weaponWarriors[(int) (Math.random() * 5)];
                    gladiator.changeWeapon(weaponWarriorForAdversary);

                    assasin.protection(gladiator.attack());
                    gladiator.protection(assasin.attack());


                    System.out.println("The health of your warrior after the strike - " + hunter.getHealth());
                    System.out.println("The health adversary after the strike - " + gladiator.getHealth());

                    if (assasin.getHealth() <= 0) {
                        System.out.println("<<< You LOSE :( >>>");
                        break;
                    } else if (gladiator.getHealth() <= 0) {
                        System.out.println("<<< You WIN :) >>>");
                        break;
                    }
                }
            }
            if (num == 4) {
                System.out.println("Greetings to you in the game! Your warrior is an paladin");
                System.out.println();
                Gladiator gladiator = gladiators[(int) (Math.random() * 4)];
                System.out.println("The health of your warrior(Paladin) - " + assasin.getHealth());
                System.out.println("The health of your adversary - " + gladiator.getHealth());
                System.out.println();
                while (paladin.getHealth() > 0) {
                    WeaponWarrior weaponWarriorForPaladin = weaponWarriors[(int) (Math.random() * 5)];
                    paladin.changeWeapon(weaponWarriorForPaladin);

                    WeaponWarrior weaponWarriorForAdversary = weaponWarriors[(int) (Math.random() * 5)];
                    gladiator.changeWeapon(weaponWarriorForAdversary);

                    paladin.protection(gladiator.attack());
                    gladiator.protection(paladin.attack());


                    System.out.println("The health of your warrior after the strike - " + paladin.getHealth());
                    System.out.println();
                    System.out.println("The health adversary after the strike - " + gladiator.getHealth());

                    if (paladin.getHealth() <= 0) {
                        System.out.println("<<< You LOSE :( >>>");
                        break;
                    } else if (gladiator.getHealth() <= 0) {
                        System.out.println("<<< You WIN :) >>>");
                        break;
                    }
                }
            }
            } else {
                System.out.println(" BYE!!! ");
            }
        }
    }
