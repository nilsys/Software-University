package motocrossWorldChampionship.repositories;

import motocrossWorldChampionship.entities.interfaces.Motorcycle;
import motocrossWorldChampionship.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MotorcycleRepository implements Repository<Motorcycle> {
    private Collection<Motorcycle> motorcycles;

    public MotorcycleRepository() {
        this.motorcycles = new ArrayList<>();
    }

    @Override
    public Motorcycle getByName(String model) {
        for (Motorcycle motorcycle : this.motorcycles) {
            if (motorcycle.getModel().equals(model)){
                return motorcycle;
            }
        }
        return null;
    }

    @Override
    public Collection<Motorcycle> getAll() {
        return Collections.unmodifiableCollection(this.motorcycles);
    }

    @Override
    public void add(Motorcycle model) {
        this.motorcycles.add(model);
    }

    @Override
    public boolean remove(Motorcycle model) {
        return this.motorcycles.removeIf(m ->m.getModel().equals(model.getModel()));
    }
}
