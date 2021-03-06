package android.support.v17.leanback.streamingapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardRow {

    @SerializedName("shadow") private boolean shadow = true;
    @SerializedName("title") private String title;
    @SerializedName("cards") private List<Card> cards;

    public boolean useShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
