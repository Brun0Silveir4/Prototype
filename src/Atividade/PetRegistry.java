package Atividade;

import java.util.HashMap;
import java.util.Map;

//Mantém um registro dos protótipos de pets disponíveis.

public class PetRegistry {
    
    private Map<String, PetPrototype> prototypes;

    public PetRegistry() {
        prototypes = new HashMap<>();
        prototypes.put("cat", new Pet("Siamês", "Logan", 3));
        prototypes.put("dog", new Pet("Labrador", "Hércules", 5));
    }

    public void addPrototype(String type, PetPrototype prototype) {
        prototypes.put(type, prototype);
    }

    public PetPrototype getPrototype(String type) {
        PetPrototype prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

