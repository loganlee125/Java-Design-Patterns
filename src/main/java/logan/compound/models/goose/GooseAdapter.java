package logan.compound.models.goose;

import logan.compound.Quackable;

public class GooseAdapter implements Quackable {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

}
