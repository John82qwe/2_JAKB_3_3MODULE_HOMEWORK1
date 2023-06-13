package Items;

import Material.Metal;

public class Sword <T extends Metal>{
    private T material;

    public Sword(T material){
        this.material = material;

    }

    public boolean check(){
        if (material.getEndurance() > 49){
            return true;
        }
        else {
            return false;
        }
    }
}
