package HW6;

public class Notebook {
    private String name;
    private String ram;
    private String hardDisk;
    private String operatingSystem;
    private String colour;
    
    public Notebook(String name, String ram, String hardDisk, String operatingSystem, String colour) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Notebook [name=" + name + ", ram=" + ram + ", hardDisk=" + hardDisk + ", operatingSystem="
                + operatingSystem + ", colour=" + colour + "]";
    }

    
  
    
    
}
