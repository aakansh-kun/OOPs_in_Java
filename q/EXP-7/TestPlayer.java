interface Playable 
{
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable 
{
    private boolean playing = false;
    private boolean paused = false;
    @Override
    public void play() 
    {
        if (!playing) 
        {
            playing = true;
            paused = false;
            System.out.println("Music is playing.");
        } 
        else 
        {
            System.out.println("Music is already playing.");
        }
    }
    @Override
    public void pause() 
    {
        if (playing && !paused) 
        {
            paused = true;
            System.out.println("Music is paused.");
        } 
        else if (!playing) 
        {
            System.out.println("Cannot pause. Music is not playing.");
        } 
        else 
        {
            System.out.println("Music is already paused.");
        }
    }
    @Override
    public void stop() 
    {
        if (playing) 
        {
            playing = false;
            paused = false;
            System.out.println("Music is stopped.");
        } 
        else 
        {
            System.out.println("Music is already stopped.");
        }
    }
}
public class TestPlayer 
{
    public static void main(String[] args) 
    {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.play();
        player.stop();
        player.stop();
        player.pause();
    }
}
