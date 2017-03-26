package org.vaadin.addons.searchbox.event;

import org.vaadin.addons.searchbox.SearchBox;

import com.vaadin.ui.Component;

public class SearchEvent extends Component.Event {

    private final String query;

    public SearchEvent(SearchBox source, String query) {
        super(source);

        this.query = query;
    }

    public String getSearchTerm() {
        return this.query;
    }
}