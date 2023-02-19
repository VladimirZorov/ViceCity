package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GunRepository implements Repository<Gun>{

    private Collection<Gun> models;

    public GunRepository() {
        this.models = new ArrayList<Gun>();
    }

    @Override
    public Collection<Gun> getModels() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Gun model) {
        if (!models.contains(model)) {
            models.add(model);
        }
    }

    @Override
    public boolean remove(Gun model) {
        if (models.contains(model)) {
            models.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Gun find(String name) {
        return models.stream()
                .filter(gun -> gun.getName().equals(name)).findFirst()
                .orElse(null);
    }
}
