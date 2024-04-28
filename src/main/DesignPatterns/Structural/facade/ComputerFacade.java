package facade;

import facade.sub_systems.CPU;
import facade.sub_systems.HardDisk;
import facade.sub_systems.RAM;

public class ComputerFacade {
    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDisk = new HardDisk();
    }

    public void start(){
        cpu.freeze();
        hardDisk.read();
        ram.load();
        cpu.jump();
        cpu.execute();
    }
}
