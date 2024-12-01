package data_access;

import java.util.ArrayList;
import java.util.List;

/**
 * LanguageMapper
 */

public class GetLanguageClass implements ILanguageClassGetter {

    LanguageClassFactory factory = new LanguageClassFactory();
    private static final List<LanguageClass> languageClasses = new ArrayList<>();

    public GetLanguageClass() {
        createLanguageClasses();
    }

    private void createLanguageClasses() {
        languageClasses.add(factory.createLanguageClass("Chinese",
                new String[] {"Chinese (simplified)", "Chinese (traditional)"}));
        languageClasses.add(factory.createLanguageClass("English",
                new String[] {"English (American)", "English (British)"}));
        languageClasses.add(factory.createLanguageClass("Portuguese",
                new String[] {"Portuguese (Brazilian)", "Portuguese (European)"}));

    }

    /**
     * @param language the language name of text (ie. English).
     */
    @Override
    public ILanguageMapper giveLanguageClass(String language) {
        // If the language has multiple target languages
       for (LanguageClass languageClass: languageClasses) {
           if (languageClass.matches(language)) {
               return languageClass;
           }
       }

       // Else, input language and output languages are the same when switched.
        // Use memoization to prevent duplicate classes from being created
        LanguageClass newLanguageClass = factory.createLanguageClass(language, new String[]{language});
        languageClasses.add(newLanguageClass);
        return newLanguageClass;
    }
}
