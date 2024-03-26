public class PC {
    private String processador;
    private String memoriaRAM;
    private String placaDeVideo;
    private String armazenamento;
    private String placaMae;
    private String fonteDeEnergia;
    private String gabinete;
    private String monitor;
    private String teclado;
    private String mouse;

    public PC(String processador, String memoriaRAM, String placaDeVideo, String armazenamento,
              String placaMae, String fonteDeEnergia, String gabinete, String monitor, String teclado, String mouse) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaDeVideo = placaDeVideo;
        this.armazenamento = armazenamento;
        this.placaMae = placaMae;
        this.fonteDeEnergia = fonteDeEnergia;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        // Criando objetos para representar diferentes PCs
        PC pc1 = new PC("Intel Core i7", "16GB DDR4", "NVIDIA GeForce RTX 3080",
                "SSD 1TB", "ASUS ROG Strix Z490-E", "Corsair 750W",
                "NZXT H510", "LG 27GL850-B", "Razer BlackWidow Elite", "Logitech G502");

        PC pc2 = new PC("AMD Ryzen 9 5900X", "32GB DDR4", "AMD Radeon RX 6800 XT",
                "SSD 2TB", "GIGABYTE X570 AORUS Ultra", "EVGA 850W",
                "Fractal Design Meshify C", "Dell S3220DGF", "Corsair K95 RGB Platinum", "SteelSeries Rival 650 Wireless");

        // Exibindo informações dos PCs
        System.out.println("PC 1:");
        System.out.println(pc1);
        System.out.println("\nPC 2:");
        System.out.println(pc2);
    }

    @Override
    public String toString() {
        return "PC{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", placaMae='" + placaMae + '\'' +
                ", fonteDeEnergia='" + fonteDeEnergia + '\'' +
                ", gabinete='" + gabinete + '\'' +
                ", monitor='" + monitor + '\'' +
                ", teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
