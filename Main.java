import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Byte tipoDeCuenta;
        Byte cuenta;
        byte opcionServicios;
        byte contraseñaAdmin= 123;
        String usuarioAdmin = "admin";
        byte indice = 0;
        int total = 0;
        int contadorCompra = 0;
        int eleccionCompra = 0;
        byte eleccionFinalizar;
        boolean eleccionFin = false;

        int [] codigoProd = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String [] marcaProd = {"Frisby", "Frisby", "Frisby", "Frisby", "Mcdonals", "Mcdonals", "Mcdonals", "Mcdonals", "Subway", "Subway", "Subway", "Subway"};
        String [] nombreProd = {"pollo", "Frisnack", "Ensalada", "Helado", "Bigmac", "Mcflurry", "Papitas", "Cajita feliz", "Crunchy", "Especial", "Mexicano", "Paisa"};
        int [] precio = {30000, 25000, 8000, 5900, 20000, 15000, 10000, 35000, 15000, 25000, 20000, 20000};
        int [] carrito = {0,0,0,0,0,0,0,0,0,0};
        String[] usuario = new String[5];
        String[] contrasena = new String[5];
        // ======= CLIENTES ========
        int[] cedula = new int[5];
        String[] nombre = new String[5];
        String[] apellido = new String[5];
        String[] celular = new String[5];
        String[] contraseña = new String[5];

        // ======= PRODUCTOS ========
        int[] idProducto = new int[5];
        String[] nombreProducto = new String[5];
        int[] precioProducto = new int[5];
        int[] stockProducto = new int[5];

        int[] id_pedido = new int[5];
        int[] id_usuario = new int[5];
        int[] id_proveedor = new int[5];
        int[] id_direccion = new int[5];
        int[] id_repartidor = new int[5];
        String[] fecha_pedido = new String[5];
        double[] total1 = new double[5];


        int[] detalle_id = new int[5];
        int[] detalle_pedido_id = new int[5];
        int[] producto_id = new int[5];
        int[] cantidad = new int[5];
        double[] precio_unitario = new double[5];



        boolean menuPrincipal = true;
        boolean menuUsuario = true;
        boolean menuAdmin=true;
        boolean menuServicios = true;
        //try catch para manejo de error de input en el scanner
        try {
            while (menuPrincipal) {

                System.out.println("""
                    Elija el numero de la opcion que desee realizar
                    -----------------------------------------------
                    1. Ingresar como usuario.
                    2. Ingresar como administrador.
                    3. Salir.
                    """);

                tipoDeCuenta = sc.nextByte();
                sc.nextLine();

                switch (tipoDeCuenta) {

                    case 1:
                        menuUsuario = true;

                        // menu usuario
                        while (menuUsuario) {

                            System.out.println("""
                            Elija el numero de la opción que desee realizar:
                            ------------------------------------------------
                            1. Iniciar Sesion
                            2. Crear cuenta
                            3. volver.
                            """);

                            cuenta = sc.nextByte();
                            sc.nextLine();

                            // while que controla entradas de numeros no validas
                            if (cuenta < 1 || cuenta > 3) {
                                System.out.println("opcion invalida, digite una opcion correcta");
                                break;
                            }

                            // el usuario nunca va a tener cuenta pq es un programa por consola, poreso un while que le obliga a elegir otra cosa
                            while (cuenta == 1) {
                                System.out.println("usted no tiene cuenta, porfavor cree una:");
                                break;
                            }

                            // crear cuenta
                            if (cuenta == 2) {


                                System.out.println("digite el nombre de usuario que desea tener:");
                                usuario[indice] = sc.nextLine();


                                System.out.println("digite su nueva contraseña:");
                                contrasena[indice] = sc.nextLine();
                                indice++;
                                //menu servicios
                                while(menuServicios){
                                    System.out.println("""
                                        Bienvenido al menu de nuestros servicios, digite el numero de la accion que desee realizar.
                                        ------------------------------------------------------------------------------------------
                                        1. Ver productos
                                        2. Ver Servicios
                                        3. Comprar productos
                                        4. Ver carrito
                                        5. Volver
                                        """);
                                    opcionServicios = sc.nextByte();

                                    switch (opcionServicios){
                                        case 1:
                                            System.out.println("""
                                                        Bienvenido a la tabla de nuestros productos, estos estas separados por sus marcas:
                                                        ---------------------------------------------------------------------------------
                                                         codigo  |  marca   |   producto    |   precio
                                                        ----------------------------------
                                                           01    |   frisby  |   pollo       |   30.000$
                                                           02    |  frisby  |   frisnack    |   25.000$
                                                           03    |   frisby  |   ensalada    |   8.000$
                                                           04    |  frisby  |   helado      |   5.900$
                                                         ------------------------------------------------
                                                           05    |   McDonalds   |   BigMac  |   20.000$
                                                           06    |  McDonalds   |   Mcflurry    |   15.000$
                                                           07    |   Mcdonalds   |   papitas |   10.000$
                                                           08    |   McDonalds   |   cajita feliz   |   35.000$
                                                         ------------------------------------------------
                                                           09    |  Subway  |  crunchy  |   15.000$
                                                           10    |  Subway  | especial  |   25.000$
                                                           11    |  Subway  | Mexicano  |   20.000$
                                                           12    |  Subway  |   Paisa   |   20.000$
                                                        -------------------------------------------
                                             
                                                        """);

                                            break;
                                        case 2:
                                            System.out.println("""
                                                    Bienvenido a la tabla de nuestros servicios, estos consisten en:
                                                    1. Entrega de ordenes desde locales o cocinas invisibles.
                                                    2. Registro de la canitdad de dinero que usted gasta en comida rapida.
                                                    3. Posibilidad de empleo para perosnas que quieran funcionar como nuestros repatidores.
                                                    """);
                                            break;
                                        case 3: do{System.out.println("""
                                                Bienvenido a la tabla de nuestros productos, estos estas separados por sus marcas:
                                                ---------------------------------------------------------------------------------
                                                 codigo  |  marca   |   producto    |   precio
                                                ----------------------------------
                                                   01    |   frisby  |   pollo       |   30.000$
                                                   02    |   frisby  |   frisnack    |   25.000$
                                                   03    |   frisby  |   ensalada    |   8.000$
                                                   04    |   frisby  |   helado      |   5.900$
                                                 ------------------------------------------------
                                                   05    |   McDonalds   |  BigMac   |   20.000$
                                                   06    |   McDonalds   |  Mcflurry |   15.000$
                                                   07    |   Mcdonalds   |  papitas  |   10.000$
                                                   08    |   McDonalds   |  cajita feliz |   35.000$
                                                 ------------------------------------------------
                                                   09    |  Subway  |  crunchy  |   15.000$
                                                   10    |  Subway  | especial  |   25.000$
                                                   11    |  Subway  | Mexicano  |   20.000$
                                                   12    |  Subway  |   Paisa   |   20.000$
                                                -------------------------------------------
                                                
                                                ingrese el codigo del producto que desea comprar
                                                """);
                                            eleccionCompra = sc.nextInt();
                                            sc.nextLine();

                                            if (eleccionCompra > 12 || eleccionCompra < 0) {
                                                System.out.println("codigo no valido");
                                                break;
                                            }

                                            carrito[contadorCompra] = eleccionCompra;
                                            contadorCompra++;

                                            System.out.println("""
                                                    Desea ingresar un nuevo producto?
                                            
                                                    1. Si
                                                    2. Terminar compra""");

                                            eleccionFinalizar = sc.nextByte();
                                            sc.nextLine();

                                            if (eleccionFinalizar == 1) {
                                                // continuar
                                            } else if (eleccionFinalizar == 2) {
                                                eleccionFin = true;
                                                break;
                                            } else {
                                                System.out.println("ingrese un numero valido");
                                                break;
                                            }

                                        }while (!eleccionFin);
                                        case 4:
                                            if (contadorCompra == 0) {
                                                System.out.println("El carrito está vacío.");
                                                break;
                                            }



                                            System.out.println("---------------- CARRITO DE COMPRA ----------------");
                                            System.out.println("Código | Producto | Marca | Precio");
                                            System.out.println("----------------------------------------------------");

                                            for (int i = 0; i < contadorCompra; i++) {

                                                int codigo = carrito[i];   // el código (1–12)
                                                int index = codigo - 1;    // índice correcto del array

                                                System.out.println(
                                                        "  " + codigoProd[index] +
                                                                "    | " + nombreProd[index] +
                                                                " | " + marcaProd[index] +
                                                                " | " + precio[index]
                                                );

                                                total += precio[index];
                                            }

                                            System.out.println("----------------------------------------------------");
                                            System.out.println("Total a pagar: " + total + " pesos\n");
                                            break;
                                        case 5:
                                            System.out.println("saliendo del menu de servicios!");
                                            menuServicios = false;
                                               break;
                                        default:
                                            System.out.println("opcion ingresada invalida, ingrese un numero valido.");
                                    }

                                }
                            }
                            if (cuenta == 3){
                                System.out.println("saliendo del menu de usuarios!");
                                menuUsuario = false;
                                menuPrincipal = true;


                            }

                        }
                        break;
                    case 2:
                        menuAdmin=true;

                        while (menuAdmin){
                            System.out.println("""
                                    bienvenido adminstrador
                                    -----------------------
                                    ingresa su nombre de usuario""");
                            usuarioAdmin = sc.nextLine();
                            if (usuarioAdmin.equals("admin")){
                                System.out.println("""
                                             ingrese su contraseña""");
                                contraseñaAdmin = sc.nextByte();
                                if (contraseñaAdmin == 123){
                                    // ADMINISTRADOR -----------------


                                    int opcionAdmin = 0;

                                    do {

                                        System.out.println("""
                            ===== Menú Administrador =====
                            
                            1) Gestionar clientes
                            2) Gestionar productos
                            3) para gestionar servicios (pedidos)
                            4) para gestionar ventas (detalle de pedidos)
                            5) Regresar
                            """);

                                        opcionAdmin = sc.nextInt();

                                        // ========== CRUD CLIENTES ==========
                                        if (opcionAdmin == 1) {

                                            int opcionCliente = 0;

                                            do {

                                                System.out.println("""
                                    ===== GESTIÓN DE CLIENTES =====

                                    1) Crear clientes nuevos
                                    2) Listar clientes
                                    3) Buscar un cliente
                                    4) Actualizar un cliente
                                    5) Eliminar un cliente
                                    6) Regresar
                                    """);

                                                opcionCliente = sc.nextInt();

                                                // CREAR CLIENTE --------------------------------------
                                                if (opcionCliente == 1) {
                                                    System.out.println("=== Crear clientes ===");

                                                    int i = 0;

                                                    while (i < cedula.length) {

                                                        if (cedula[i] == 0) {

                                                            System.out.println("Ingrese la cédula:");
                                                            cedula[i] = sc.nextInt();
                                                            sc.nextLine();

                                                            System.out.println("Ingrese el nombre:");
                                                            nombre[i] = sc.nextLine();

                                                            System.out.println("Ingrese el apellido:");
                                                            apellido[i] = sc.nextLine();

                                                            System.out.println("Ingrese el celular:");
                                                            celular[i] = sc.nextLine();

                                                            System.out.println("Ingrese la contraseña:");
                                                            contraseña[i] = sc.nextLine();

                                                            System.out.println("Cliente creado.");
                                                            i = cedula.length;
                                                        }

                                                        i++;
                                                    }
                                                }

                                                // LISTAR CLIENTES -------------------------------------
                                                if (opcionCliente == 2) {
                                                    System.out.println("=== Listado de clientes ===");

                                                    int i = 0;

                                                    while (i < cedula.length) {

                                                        if (cedula[i] != 0) {
                                                            System.out.println("Cliente " + (i + 1));
                                                            System.out.println("Cédula: " + cedula[i]);
                                                            System.out.println("Nombre: " + nombre[i]);
                                                            System.out.println("Apellido: " + apellido[i]);
                                                            System.out.println("Celular: " + celular[i]);
                                                            System.out.println("----------------------");
                                                        }

                                                        i++;
                                                    }
                                                }

                                                // BUSCAR CLIENTE ----------------------------------------
                                                if (opcionCliente == 3) {
                                                    System.out.println("=== Buscar cliente ===");
                                                    System.out.println("Ingrese la cédula:");

                                                    int buscar = sc.nextInt();

                                                    int i = 0;
                                                    int encontrado = -1;

                                                    while (i < cedula.length) {

                                                        if (cedula[i] == buscar) {
                                                            encontrado = i;
                                                            i = cedula.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (encontrado == -1) {
                                                        System.out.println("Cliente no encontrado.");
                                                    } else {
                                                        System.out.println("Cliente encontrado:");
                                                        System.out.println("Cédula: " + cedula[encontrado]);
                                                        System.out.println("Nombre: " + nombre[encontrado]);
                                                        System.out.println("Apellido: " + apellido[encontrado]);
                                                        System.out.println("Celular: " + celular[encontrado]);
                                                    }
                                                }

                                                // ACTUALIZAR CLIENTE -----------------------------------
                                                if (opcionCliente == 4) {
                                                    System.out.println("=== Actualizar cliente ===");
                                                    System.out.println("Ingrese la cédula:");

                                                    int cedulaAct = sc.nextInt();
                                                    sc.nextLine();

                                                    int i = 0;
                                                    int posAct = -1;

                                                    while (i < cedula.length) {

                                                        if (cedula[i] == cedulaAct) {
                                                            posAct = i;
                                                            i = cedula.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (posAct == -1) {
                                                        System.out.println("Cliente no encontrado.");
                                                    } else {

                                                        System.out.println("Nueva cédula:");
                                                        cedula[posAct] = sc.nextInt();
                                                        sc.nextLine();

                                                        System.out.println("Nuevo nombre:");
                                                        nombre[posAct] = sc.nextLine();

                                                        System.out.println("Nuevo apellido:");
                                                        apellido[posAct] = sc.nextLine();

                                                        System.out.println("Nuevo celular:");
                                                        celular[posAct] = sc.nextLine();

                                                        System.out.println("Nueva contraseña:");
                                                        contraseña[posAct] = sc.nextLine();

                                                        System.out.println("Cliente actualizado.");
                                                    }
                                                }

                                                // ELIMINAR CLIENTE ---------------------------------------
                                                if (opcionCliente == 5) {
                                                    System.out.println("=== Eliminar cliente ===");
                                                    System.out.println("Ingrese la cédula:");

                                                    int eliminar = sc.nextInt();

                                                    int i = 0;
                                                    int posEliminar = -1;

                                                    while (i < cedula.length) {

                                                        if (cedula[i] == eliminar) {
                                                            posEliminar = i;
                                                            i = cedula.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (posEliminar == -1) {
                                                        System.out.println("Cliente no encontrado.");
                                                    } else {

                                                        cedula[posEliminar] = 0;
                                                        nombre[posEliminar] = "";
                                                        apellido[posEliminar] = "";
                                                        celular[posEliminar] = "";
                                                        contraseña[posEliminar] = "";

                                                        System.out.println("Cliente eliminado.");
                                                    }
                                                }

                                            } while (opcionCliente != 6);
                                        }

                                        // ========== CRUD PRODUCTOS ==========
                                        if (opcionAdmin == 2) {

                                            int opcionProducto = 0;

                                            do {

                                                System.out.println("""
                                    ===== GESTIÓN DE PRODUCTOS =====

                                    1) Crear productos nuevos
                                    2) Listar productos
                                    3) Buscar un producto
                                    4) Actualizar un producto
                                    5) Eliminar un producto
                                    6) Regresar
                                    """);

                                                opcionProducto = sc.nextInt();

                                                // CREAR PRODUCTO ---------------------------------
                                                if (opcionProducto == 1) {

                                                    System.out.println("=== Crear producto ===");

                                                    int i = 0;

                                                    while (i < idProducto.length) {

                                                        if (idProducto[i] == 0) {

                                                            System.out.println("Ingrese ID del producto:");
                                                            idProducto[i] = sc.nextInt();
                                                            sc.nextLine();

                                                            System.out.println("Ingrese nombre del producto:");
                                                            nombreProducto[i] = sc.nextLine();

                                                            System.out.println("Ingrese precio:");
                                                            precioProducto[i] = sc.nextInt();

                                                            System.out.println("Ingrese stock:");
                                                            stockProducto[i] = sc.nextInt();

                                                            System.out.println("Producto creado.");
                                                            i = idProducto.length;
                                                        }

                                                        i++;
                                                    }
                                                }

                                                // LISTAR PRODUCTOS --------------------------------
                                                if (opcionProducto == 2) {

                                                    System.out.println("=== Listado de productos ===");

                                                    int i = 0;

                                                    while (i < idProducto.length) {

                                                        if (idProducto[i] != 0) {
                                                            System.out.println("Producto " + (i + 1));
                                                            System.out.println("ID: " + idProducto[i]);
                                                            System.out.println("Nombre: " + nombreProducto[i]);
                                                            System.out.println("Precio: " + precioProducto[i]);
                                                            System.out.println("Stock: " + stockProducto[i]);
                                                            System.out.println("----------------------------");
                                                        }

                                                        i++;
                                                    }
                                                }

                                                // BUSCAR PRODUCTO -------------------------------
                                                if (opcionProducto == 3) {

                                                    System.out.println("=== Buscar producto ===");
                                                    System.out.println("Ingrese ID:");

                                                    int buscar = sc.nextInt();

                                                    int i = 0;
                                                    int encontrado = -1;

                                                    while (i < idProducto.length) {

                                                        if (idProducto[i] == buscar) {
                                                            encontrado = i;
                                                            i = idProducto.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (encontrado == -1) {
                                                        System.out.println("Producto no encontrado.");
                                                    } else {
                                                        System.out.println("Producto encontrado:");
                                                        System.out.println("ID: " + idProducto[encontrado]);
                                                        System.out.println("Nombre: " + nombreProducto[encontrado]);
                                                        System.out.println("Precio: " + precioProducto[encontrado]);
                                                        System.out.println("Stock: " + stockProducto[encontrado]);
                                                    }
                                                }

                                                // ACTUALIZAR PRODUCTO -----------------------------
                                                if (opcionProducto == 4) {

                                                    System.out.println("=== Actualizar producto ===");
                                                    System.out.println("Ingrese ID:");

                                                    int idAct = sc.nextInt();
                                                    sc.nextLine();

                                                    int i = 0;
                                                    int posAct = -1;

                                                    while (i < idProducto.length) {

                                                        if (idProducto[i] == idAct) {
                                                            posAct = i;
                                                            i = idProducto.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (posAct == -1) {
                                                        System.out.println("Producto no encontrado.");
                                                    } else {

                                                        System.out.println("Nuevo ID:");
                                                        idProducto[posAct] = sc.nextInt();
                                                        sc.nextLine();

                                                        System.out.println("Nuevo nombre:");
                                                        nombreProducto[posAct] = sc.nextLine();

                                                        System.out.println("Nuevo precio:");
                                                        precioProducto[posAct] = sc.nextInt();

                                                        System.out.println("Nuevo stock:");
                                                        stockProducto[posAct] = sc.nextInt();

                                                        System.out.println("Producto actualizado.");
                                                    }
                                                }

                                                // ELIMINAR PRODUCTO ----------------------------
                                                if (opcionProducto == 5) {

                                                    System.out.println("=== Eliminar producto ===");
                                                    System.out.println("Ingrese ID:");

                                                    int eliminar = sc.nextInt();

                                                    int i = 0;
                                                    int posEliminar = -1;

                                                    while (i < idProducto.length) {

                                                        if (idProducto[i] == eliminar) {
                                                            posEliminar = i;
                                                            i = idProducto.length;
                                                        }

                                                        i++;
                                                    }

                                                    if (posEliminar == -1) {
                                                        System.out.println("Producto no encontrado.");
                                                    } else {

                                                        idProducto[posEliminar] = 0;
                                                        nombreProducto[posEliminar] = "";
                                                        precioProducto[posEliminar] = 0;
                                                        stockProducto[posEliminar] = 0;

                                                        System.out.println("Producto eliminado.");
                                                    }
                                                }




                                            } while (opcionProducto != 6);
                                        }
                                        if(opcionAdmin == 3) {
                                            int opcionPedidos;
                                            do {
                                                System.out.println("""
                                                                ===== GESTION DE SERVICIOS (PEDIDOS) =====
                                                        
                                                                Favor seleccionar una de las siguietes opciones
                                                                1) Crear pedido
                                                                2) Listar pedidos
                                                                3) buscar un pedido
                                                                4) actualizar un pedido
                                                                5) eleminar un pedido
                                                                6) Regresar al menú anterior
                                                        """);

                                                opcionPedidos = sc.nextInt();
                                                switch (opcionPedidos) {

                                                    case 1:
                                                        System.out.println("Metodo de crear pedidos");
                                                        for (int i = 0; i < id_pedido.length; i++) {
                                                            if (id_pedido[i] == 0) {

                                                                System.out.println("ingrese id del pedido:");
                                                                id_pedido[i] = sc.nextInt();
                                                                System.out.println("ingrese id del usuario");
                                                                id_usuario[i] = sc.nextInt();


                                                                System.out.println("ingrese id del proveedor");
                                                                id_proveedor[i] = sc.nextInt();

                                                                System.out.println("ingrese id de la direccin");
                                                                id_direccion[i] = sc.nextInt();

                                                                System.out.println("ingrese id del repartidor");
                                                                id_repartidor[i] = sc.nextInt();


                                                                System.out.println("ingrese la focha del pedido");
                                                                fecha_pedido[i] = sc.nextLine();

                                                                System.out.println("ingrese el total");
                                                                total1[i] = sc.nextDouble();
                                                                System.out.println("pedido creedo correctamente");
                                                                break;
                                                            }
                                                        }

                                                        break;
                                                    case 2:
                                                        System.out.println("Metodo de listar pedidos");

                                                        for (int i = 0; i < id_pedido.length; i++) {
                                                            if (id_pedido[i] != 0) {
                                                                System.out.println("id pedido" + id_pedido[i]);
                                                                System.out.println("usuario" + id_usuario[i]);


                                                                System.out.println("proveedor" + id_proveedor[i]);
                                                                System.out.println("direccion" + id_direccion[i]);
                                                                System.out.println("repartidor" + id_repartidor[i]);

                                                                System.out.println("fecha" + fecha_pedido[i]);
                                                                System.out.println("total" + total1[i]);

                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("Metodo de buscar un pedido");

                                                        System.out.println("ingrese el id del pedido a bescar");
                                                        int buscarPedido = sc.nextInt();

                                                        for (int i = 0; i < id_pedido.length; i++) {
                                                            if (id_pedido[i] == buscarPedido) {

                                                                System.out.println("pedido encontrado");
                                                                System.out.println("usuario" + id_usuario[i]);

                                                                System.out.println("proveedor" + id_proveedor[i]);

                                                                System.out.println("direccion" + id_direccion[i]);

                                                                System.out.println("repartidor" + id_repartidor[i]);


                                                                System.out.println("fecha" + fecha_pedido[i]);
                                                                System.out.println("total" + total1[i]);
                                                                break;
                                                            } else if (i == id_pedido.length - 1) {
                                                                System.out.println("pedido no encontrsdo");
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        System.out.println("Metodo de actualizar pedidos");

                                                        System.out.println("ingrese el id del pedido a actualizar");
                                                        int actualizarPedido = sc.nextInt();
                                                        for (int i = 0; i < id_pedido.length; i++) {
                                                            if (id_pedido[i] == actualizarPedido) {

                                                                System.out.println("nuevo id del usuario");
                                                                id_usuario[i] = sc.nextInt();
                                                                System.out.println("nuevo id del proveedor");
                                                                id_proveedor[i] = sc.nextInt();


                                                                System.out.println("nuevo id de la direccion");
                                                                id_direccion[i] = sc.nextInt();

                                                                System.out.println("nuevo id del repartidor");
                                                                id_repartidor[i] = sc.nextInt();


                                                                System.out.println("nueva fecha");
                                                                fecha_pedido[i] = sc.nextLine();
                                                                System.out.println("nuevo total");
                                                                total1[i] = sc.nextDouble();


                                                                System.out.println("pedido actualizado");
                                                                break;

                                                            } else if (i == id_pedido.length - 1) {
                                                                System.out.println("pedido no encontrsdo");
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        System.out.println("Metodo de eliminar pedidos");

                                                        System.out.println("ingrese el id del pedido a eliminar");
                                                        int eliminarPedido = sc.nextInt();
                                                        for (int i = 0; i < id_pedido.length; i++) {
                                                            if (id_pedido[i] == eliminarPedido) {

                                                                id_pedido[i] = 0;

                                                                id_usuario[i] = 0;
                                                                id_proveedor[i] = 0;
                                                                id_direccion[i] = 0;
                                                                id_repartidor[i] = 0;

                                                                fecha_pedido[i] = "";
                                                                total1[i] = 0;

                                                                System.out.println("pedido eliminado");
                                                                break;

                                                            } else if (i == id_pedido.length - 1) {
                                                                System.out.println("pedido no encontrsdo");
                                                            }
                                                        }

                                                        break;
                                                    case 6:
                                                        System.out.println("Regresando al menú anterior");
                                                        break;
                                                    default:
                                                        System.out.println("opcion imgresada no valida");
                                                }

                                            } while (opcionPedidos != 6);
                                            break;

                                        }
                                        if (opcionAdmin == 4){
                                            int opcionDetalle;

                                            do {
                                                System.out.println("""
                                                    ===== GESTION DE VENTAS (DETALLE PEDIDOS) =====
                                                    
                                                    Favor seleccionar una de las siguietes opciones
                                                    1) Crear detalle pedido
                                                    2) Listar detalles
                                                    3) buscar detalle
                                                    4) actualizar detalle
                                                    5) eleminar detalle
                                                    6) Regresar al menú anterior
                                            """);

                                                opcionDetalle = sc.nextInt();

                                                switch (opcionDetalle) {

                                                    case 1:
                                                        System.out.println("Metodo de crear detalle");

                                                        for (int i = 0; i < detalle_id.length; i++) {
                                                            if (detalle_id[i] == 0) {
                                                                System.out.println("id detalle");
                                                                detalle_id[i] = sc.nextInt();

                                                                System.out.println("id pedido");
                                                                detalle_pedido_id[i] = sc.nextInt();
                                                                System.out.println("id producto");
                                                                producto_id[i] = sc.nextInt();

                                                                System.out.println("cantidad");
                                                                cantidad[i] = sc.nextInt();
                                                                System.out.println("precio unitario");
                                                                precio_unitario[i] = sc.nextDouble();

                                                                System.out.println("detalle creado");
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Metodo de listar detalle pedidos");

                                                        for (int i = 0; i < detalle_id.length; i++) {
                                                            if (detalle_id[i] != 0) {

                                                                System.out.println("id detalle" + detalle_id[i]);

                                                                System.out.println("pedido" + detalle_pedido_id[i]);
                                                                System.out.println("producto" + producto_id[i]);


                                                                System.out.println("cantidad" + cantidad[i]);
                                                                System.out.println("precio unitario" + precio_unitario[i]);

                                                            }
                                                        }

                                                        break;
                                                    case 3:
                                                        System.out.println("Metodo de buscar detalle");

                                                        System.out.println("ingrese el id del detalle");
                                                        int buscarDetalle = sc.nextInt();
                                                        for (int i = 0; i < detalle_id.length; i++) {
                                                            if (detalle_id[i] == buscarDetalle) {

                                                                System.out.println("detalle encontrado");
                                                                System.out.println("pedido" + detalle_pedido_id[i]);

                                                                System.out.println("producto" + producto_id[i]);
                                                                System.out.println("cantidad" + cantidad[i]);

                                                                System.out.println("precio unitario" + precio_unitario[i]);
                                                                break;

                                                            } else if (i == detalle_id.length-1) {
                                                                System.out.println("detalle no encontrado");
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        System.out.println("Metodo de actualizar detalle");

                                                        System.out.println("ingrese el id del detalle a actualizar:");
                                                        int actualizarDetalle = sc.nextInt();

                                                        for (int i = 0; i < detalle_id.length; i++) {
                                                            if (detalle_id[i] == actualizarDetalle) {
                                                                System.out.println("nuevo id pedido");
                                                                detalle_pedido_id[i] = sc.nextInt();
                                                                System.out.println("nuevo id producto");
                                                                producto_id[i] = sc.nextInt();


                                                                System.out.println("nueva cantidad");
                                                                cantidad[i] = sc.nextInt();
                                                                System.out.println("nuevo precio unitario");
                                                                precio_unitario[i] = sc.nextDouble();

                                                                System.out.println("detalle actualizado");
                                                                break;

                                                            } else if (i == detalle_id.length-1) {
                                                                System.out.println("detalle no encontrado");
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        System.out.println("Metodo de eliminar detalle");

                                                        System.out.println("ingrese el id del detalle a eliminar");
                                                        int eliminarDetalle = sc.nextInt();

                                                        for (int i = 0; i < detalle_id.length; i++) {
                                                            if (detalle_id[i] == eliminarDetalle) {
                                                                detalle_id[i] = 0;
                                                                detalle_pedido_id[i] = 0;
                                                                producto_id[i] = 0;

                                                                cantidad[i] = 0;
                                                                precio_unitario[i] = 0;

                                                                System.out.println("detalle eliminado");
                                                                break;

                                                            } else if (i == detalle_id.length-1) {
                                                                System.out.println("detalle no encontrado");
                                                            }
                                                        }
                                                        break;
                                                    case 6:
                                                        System.out.println("Regresando al menú anterior");
                                                        break;
                                                }

                                            } while (opcionDetalle != 6);
                                            break;
                                        }

                                    } while (opcionAdmin != 5);





                                }
                                else {
                                    System.out.println("contraseña incorrecta");
                                }
                            }
                            else {
                                System.out.println("usuario invalido");

                            }

                        }
                    case 3:
                        System.out.println("saliendo del programa, Adios!");
                        return;
                    default:
                        System.out.println("opcion elegida invalida, porfavor digite un numero correcto");



                }
            }

        }catch (Exception exception){
            System.out.println("valor ingresado invalido. Adios!");
            return;
        }


    }
}
