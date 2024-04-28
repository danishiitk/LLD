package flyweight;

public class TextEditorApp {
    private final CharacterFactory characterFactory = new CharacterFactory();
    public void type(char symbol, int position){
        Character concreteCharacter = characterFactory.getCharacter(symbol);
        concreteCharacter.draw(position);
    }

    public static void main(String[] args) {
        TextEditorApp textEditorApp = new TextEditorApp();
        textEditorApp.type('d', 0);
        textEditorApp.type('a',1);
        textEditorApp.type('n',2);
        textEditorApp.type('i',3);
        textEditorApp.type('s',4);
        textEditorApp.type('h',5);
    }
}
