package People.State;

import People.Role;

public class Health implements State{

    private String state="????";

    @Override
    public int doATK(Role role) {
        return role.getAtk();
    }

    @Override
    public String toString() {
        return state;
    }
}
