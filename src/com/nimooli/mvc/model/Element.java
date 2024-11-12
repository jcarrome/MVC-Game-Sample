package com.nimooli.mvc.model;

// Interfaz Movable
public interface Movable {
    boolean move(DIRECTION dir, Element caller);
}

// Interfaz GameEndable
public interface GameEndable {
    void gameOver();
}

// Interfaz Container
public interface Container {
    void setElement(Element element);
    Element getElement();
}

// Clase Element actualizada
public abstract class Element implements Movable, GameEndable {
    private Container container;

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container c) {
        container = c;
        if (container.getElement() != this) {
            container.setElement(this);
        }
    }

    @Override
    public String toString() {
        return "Element";
    }
}
