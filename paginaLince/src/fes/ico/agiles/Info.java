/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico.agiles;

/**
 *
 * @author Miguel
 */
public class Info {

    private String info[] = {"El desarrollo ágil de software envuelve un enfoque para la toma de decisiones en los proyectos de software, que se refiere "
        + "a \nmétodos de ingeniería del software basados en el desarrollo iterativo e incremental, donde "
        + "los requisitos y soluciones  \nevolucionan con el tiempo según la necesidad del proyecto. \n\n\n"
        + "Así el trabajo es realizado mediante la colaboración de equipos auto-organizados y multidisciplinarios, inmersos en un \n proceso compartido "
        + "de toma de decisiones a corto plazo.\n\n\n"
        + "Objetivos\n\n"
        + "• Entregar valor a la empresa de forma temprana y continua.\n"
        + "• Apoyar al ROI, Return Of Investment.\n"
        + "• Establece los objetivos del proyecto en forma temprana.\n"
        + "• Incluir expertos en el negocio(cliente) en el esfuerzo de desarrollo de\n"
        + "  software.\n"
        + "• Entregar el mayor valor posible de la forma más frecuente posible.\n"
        + "• Decremento en el costo de desarrollo.\n"
        + "• Actuar sin un plan prediseñado, responder al cambio.\n"
        + "• Cancelando malos proyectos al principio de ellos evitando costos.", //AQUI TERMINE MI CADENA EN POSICION 0

        "Scrum es un proceso de gestión y control que reduce la complejidad en el desarrollo de productos para satisfacer \n las necesidades de los "
        + "clientes." + "La gerencia y los equipos de Scrum trabajan juntos alrededor de requisitos y tecnologías \n para entregar productos "
        + "funcionando de manera incremental usando el empirismo." + "\n \n Scrum es un marco de trabajo simple que promueve la "
        + "\n colaboración en los equipos para lograr desarrollar productos complejos. \n\n" + "Ken Schwaber y Jeff Sutherland han escrito "
        + "La Guía Scrum para explicar Scrum de manera clara y simple. "
        +"\n\n\nEn Scrum se realizan entregas parciales y regulares del producto final, priorizadas por el beneficio que aportan al receptor del proyecto."
        +"\nPor ello, Scrum está especialmente indicado para proyectos en entornos complejos, donde se necesita obtener resultados pronto, "
        + "\ndonde los requisitos son cambiantes o poco definidos, donde la innovación, la competitividad, la flexibilidad y la productividad "
        + "\nson fundamentales.",//AQUI TERMINE MI CADENA EN POSICION 1

        "• PRODUCT OWNER: \tESTABLECE EL OBJETIVO A TRAVÉS DE UN DESEO A CUMPLIR.\n \t\tREPRESENTA A LOS PATROCINADORES (STAKEHOLDERS).\n\n\n"
        + "• SCRUM MASTER:\tGUÍA AL EQUIPO A LA IDENTIFICACIÓN DE ENTREGABLES.\n\t\tFACILITA LA COMUNICACIÓN CON EL PRODUCT OWNER."
        + "\n\t\tESTABLECE LOS CALENDARIOS Y AGENDAS.\n\n\n"
        + "• SCRUM TEAM: \tAUTO ORGANIZADO\n\t\tDE 3 A 9 MIEMBROS.\n\t\tDETERMINAN COMO SE REPARTE EL TRABAJO DE DESARROLLO",
        //AQUI TERMINE MI CADENA EN LA POSICION 2

        "Los artefactos de Scrum existen para proveer transparencia y oportunidades de inspección y adaptación."
        + "\nLos artefactos definidos por Scrum están específicamente definidos "
        + "para fomentar la transparencia de la información \nde tal manera que todos tengan el mismo entendimiento de lo que se está llevando a cabo "
        + "a través de los artefactos.\n\nLos artefactos principales son: \n\n" + "Product Backlog:\t• Representa la visión y expectativas del cliente "
        + "respecto a " + "los objetivos y entregas del producto. \n\t\t  o proyecto."
        + "\n\t\t• Para cada objetivo/requisito se indica el valor que aporta al cliente y el coste estimado de completarlo."
        + "\n\t\t• En la lista se indican las posibles iteraciones y las entregas esperadas por el cliente."
        + "\n\nSprint Backlog:\t\t• Lista de tareas que el equipo elabora en la reunión de planificación de la iteración (Sprint planning)"
        + "\n\t\tcomo plan para completar los objetivos/requisitos seleccionados para la iteración y que "
        + "\n\t\tse compromete a demostrar al cliente al finalizar la iteración,"
        + " en forma de incremento \n\t\tde producto preparado para ser entregado. \n" + "\n"
        + "Increment: \t\t• Un gráfico de trabajo pendiente a lo largo del tiempo muestra la velocidad a la que se"
        + " \n\t\t  está completando los objetivos/requisitos. "
        + "\n\t\t• Permite extrapolar si el Equipo podrá completar el trabajo en el tiempo estimado.",//AQUI TERMINA MI CADENA EN LA POSICION 3 
};

    public String getInfo(int posicion) {
        return info[posicion];
    }

}
