//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Proyecto proyecto1 = new Proyecto();

    proyecto1.setNombre("Robot");
    proyecto1.setProgreso(80);
    proyecto1.setResponsable("Michael");
    proyecto1.setTerminado(true);
    proyecto1.avanzar(10);

    System.out.println(proyecto1.getNombre());
    System.out.println(proyecto1.getProgreso());
    System.out.println(proyecto1.getResponsable());
    System.out.println(proyecto1.getTerminado());

}
