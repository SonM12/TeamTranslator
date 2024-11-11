package app;

import data_access.DBTranslateTextDataAccessObject;

public class MainTranslatorApplication {
    // create the data access and inject it into our builder!
    final DBTranslateTextDataAccessObject translateTextDataAccess = new DBTranslateTextDataAccessObject();

    final TranslateTextAppBuilder builder = new TranslateTextAppBuilder();
        builder.addTranslateTextDAO(translateTextDataAccess)
                .addTranslateTextView()
               .addTranslateTextUseCase()
                .build().setVisible(true);
}
