package ns.apprentice.poo.library;

import java.util.HashMap;

import ns.apprentice.poo.library.view.LibraryUI;

public class App {

    public static final String BEAN_MAIN_VIEW = "MAIN_VIEW";

    private static HashMap<String, Object> beans;

    static {
        beans = new HashMap<>();

    }

    public static void main(String[] args) throws Exception {

        LibraryUI libraryUI = (LibraryUI) App.getBean(BEAN_MAIN_VIEW);

        do {
            try {
                libraryUI = libraryUI.execute();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                libraryUI = (LibraryUI) App.getBean(BEAN_MAIN_VIEW);
            }
        } while (libraryUI != null);

    }


    public static Object getBean(String beanId) {
        return beans.get(beanId);
    }
}
