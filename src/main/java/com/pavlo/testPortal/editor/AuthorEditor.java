package com.pavlo.testPortal.editor;

import com.pavlo.testPortal.entity.Author;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class AuthorEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        Author author = new Author(text);
        setValue(author);
    }
}
