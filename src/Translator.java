public interface Translator {
    // Interfaces
    // Similar to an abstract class but focused on defining behaviors (methods)
    // instead of abstracting common characteristics (fields or implementation)
    // by default is public and abstract
    void translate(); // to implement on child

    // with default implementation
    default void initTranslator(){
        System.out.println("Initializing translator");
    }
}

// instead of extends it uses implements
// it needs to implement methods of Translator that are not implemented there
// the ones implemented there will be inherited by default
class English implements Translator {
    @Override
    public void translate(){
        System.out.println("Translating to English");
    }
}

class French implements Translator {
    // we can override the method from the interface
    @Override
    public void initTranslator(){
        System.out.println("Initializing french translator");
    }
    // this one is implemented
    @Override
    public void translate(){
        System.out.println("Translating to French");
    }
}

class translatorTest {
    public static void main(String[] args) {

        Translator english = new English();
        // using the inherited method
        english.initTranslator();
        // using the method implemented on itself
        english.translate();

        Translator french = new French();
        // using the override method on french class
        french.initTranslator();
        french.translate();
    }
}