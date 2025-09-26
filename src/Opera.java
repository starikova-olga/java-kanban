public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, String director, int choirSize, String musicAuthor, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Название балета: " + getTitle() + ", продолжительность: " + getDuration() + ", режиссёр: " + getDirector() + ", размер хора: " + choirSize + ", автор музыки: " + getMusicAuthor() + ", текст либретто: " + getLibrettoText() + ".";
    }
}