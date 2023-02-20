package computador;



public class ComputadorF {
	private cpu cpu;
    private DiscoDuro discoDuro;
    private memoria memory;

    public ComputadorF(){
        this.cpu      = new cpu();
       this.discoDuro = new DiscoDuro();
        this.memory    = new memoria();
    }

    public void start(){
        System.out.println("STARTING...");
        cpu.freeze();
        memory.load();
       discoDuro.read();
        cpu.jump();
        cpu.execute();
    }
}
