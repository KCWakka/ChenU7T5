public class CarRepairTest {
    public static void main(String[] args) {
        System.out.println("---- TESTING PART B ----");
        RepairSchedule r = new RepairSchedule(6);

        boolean repair1 = r.addRepair(3, 4);
        System.out.println(r.getSchedule());
        System.out.println(repair1);
        System.out.println("--------------");

        boolean repair2 = r.addRepair(0, 1);
        System.out.println(r.getSchedule());
        System.out.println(repair2);
        System.out.println("--------------");

        boolean repair3 = r.addRepair(0, 2);
        System.out.println(r.getSchedule());
        System.out.println(repair3);
        System.out.println("--------------");

        boolean repair4 = r.addRepair(2, 4);
        System.out.println(r.getSchedule());
        System.out.println(repair4);
        System.out.println("--------------");

        r.carOut(4);
        System.out.println(r.getSchedule());
        System.out.println("--------------");

        boolean repair5 = r.addRepair(1, 4);
        System.out.println(r.getSchedule());
        System.out.println(repair5);

        System.out.println("\n---- TESTING PART C ----");
        System.out.println(r.availableMechanics());
    }
}
