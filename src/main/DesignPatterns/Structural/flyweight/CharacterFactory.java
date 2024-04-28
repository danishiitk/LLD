package flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory
public class CharacterFactory {
    private final Map<java.lang.Character, ConcreteCharacter> characterCache = new HashMap<>();
    public Character getCharacter(char symbol){
        ConcreteCharacter concreteCharacter = characterCache.get(symbol);
        if(concreteCharacter == null){
            concreteCharacter = new ConcreteCharacter(symbol);
            characterCache.put(symbol, concreteCharacter);
        }
        return concreteCharacter;
    }
}
