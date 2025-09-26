
    public class Ballet extends MusicalShow {
        String choreographer;

        public Ballet(String title, int duration, String director, String musicAuthor, String librettoText, String choreographer) {
            super(title, duration, director, musicAuthor, librettoText);
            this.choreographer = choreographer;
        }

        public String getChoreographer() {

            return choreographer;
        }
        @Override
        public String toString() {
            return "Название балета: " + getTitle() + ", Продолжительность: " + getDuration() + ", Режиссёр: " + getDirector() + ", Автор музыки: " + getMusicAuthor() + ", текс либретто: " + getLibrettoText() + ", хореограф: " + choreographer + ".";
        }

    }


