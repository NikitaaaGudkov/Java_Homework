package DZ_6;

public class NoteBook {
    private String name;
    private Integer RAM;
    private Integer capacityHardDisk;
    private String operatingSystem;
    private String colour;

    public NoteBook(String name, Integer RAM, Integer capacityHardDisk, String operatingSystem, String colour) {
        this.name = name;
        this.RAM = RAM;
        this.capacityHardDisk = capacityHardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }
    public Integer getRAM() {
        return RAM;
    }
    public Integer getCapacityHardDisk() {
        return capacityHardDisk;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", RAM: " + RAM + " ГБ, hard disk capacity: " + capacityHardDisk + 
            ", operating system: " + operatingSystem + ", colour: " + colour;
    }
}
