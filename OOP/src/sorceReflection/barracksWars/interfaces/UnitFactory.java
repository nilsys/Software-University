package sorceReflection.barracksWars.interfaces;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ClassNotFoundException;
}