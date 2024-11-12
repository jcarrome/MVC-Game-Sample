package com.nimooli.mvc.model;

public abstract class Direction {
    private final String name;

    public Direction(String name) {
        this.name = name;
    }

    public abstract Direction getOppositeDirection();

    public String getName() {
        return name;
    }
}

public class North extends Direction {
    public North() {
        super("North");
    }

    @Override
    public Direction getOppositeDirection() {
        return new South();
    }
}

public class South extends Direction {
    public South() {
        super("South");
    }

    @Override
    public Direction getOppositeDirection() {
        return new North();
    }
}

public class East extends Direction {
    public East() {
        super("East");
    }

    @Override
    public Direction getOppositeDirection() {
        return new West();
    }
}

public class West extends Direction {
    public West() {
        super("West");
    }

    @Override
    public Direction getOppositeDirection() {
        return new East();
    }
}
