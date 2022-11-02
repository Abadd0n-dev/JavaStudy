public class program {
    public static void main(String[] args) {
        HW6.list.add(new HW6("SuperNote", HW6.CpuVendors.AMD,
                HW6.Vendors.Asus, HW6.Color.black, HW6.OS.WithoutOS));
        HW6.list.add(new HW6("23", HW6.CpuVendors.Intel,
                HW6.Vendors.Asus, HW6.Color.black, HW6.OS.WithoutOS));
        HW6.list.add(new HW6("31", HW6.CpuVendors.AMD,
                HW6.Vendors.MSI, HW6.Color.red, HW6.OS.Windows));
        HW6.list.add(new HW6("fdhfh", HW6.CpuVendors.AMD,
                HW6.Vendors.Lenovo, HW6.Color.black, HW6.OS.WithoutOS));
        HW6.list.add(new HW6("1133", HW6.CpuVendors.AMD,
                HW6.Vendors.Asus, HW6.Color.green, HW6.OS.DOS));
        HW6.list.add(new HW6("14213", HW6.CpuVendors.AMD,
                HW6.Vendors.Asus, HW6.Color.blue, HW6.OS.Linux));

        HW6.printFiltered("Asus");
        System.out.println();
        HW6.printFiltered("Intel");
        System.out.println();
        HW6.printFiltered("AMD");
        System.out.println();
        HW6.printFiltered("31");
        System.out.println();
        HW6.printFiltered("Linux");
    }
}
