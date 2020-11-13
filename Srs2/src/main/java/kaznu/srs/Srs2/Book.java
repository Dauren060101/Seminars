package kaznu.srs.Srs2;

public class Book {
    private String name;
    private String author;
    private String  genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
                "Name:"+ getName()+
                "Author:"+getAuthor()+
                "Genre:"+getGenre()+
                "}";
    }
}
