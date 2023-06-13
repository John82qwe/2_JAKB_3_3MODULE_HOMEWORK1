package Work;

import Items.Sword;
import Material.Metal;
import Material.Plastic;
import Metal.Steel;
import Metal.Copper;
import Metal.Iron;

public class Test {
    public static void main(String[] args) {
        Steel st = new Steel();
        Copper cp = new Copper();
        Iron ir = new Iron();
        Plastic pc = new Plastic();

        Sword sw0 = new Sword(st);
        System.out.println(sw0.check());
        Sword sw1 = new Sword(cp);
        System.out.println(sw1.check());
        Sword sw2 = new Sword(ir);
        System.out.println(sw2.check());
        Sword sw3 = new Sword(pc);            // нельзя создать меч из пластика
        System.out.println(sw3.check());

    }
}
