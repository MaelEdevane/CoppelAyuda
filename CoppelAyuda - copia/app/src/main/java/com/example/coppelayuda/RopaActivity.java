package com.example.coppelayuda;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RopaActivity extends AppCompatActivity {

    private List<Item> itemList;
    private SearchView searchView; // Agregar la referencia al SearchView
    private com.example.coppelayuda.adapters.ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ropa);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.searchView); // Inicializar el SearchView

        // Inicializa la lista de elementos de datos
        itemList = new ArrayList<>();
        itemList.add(new Item("Corte de caja/parciales", "Cierre del dia",
                " F6+F2", "" +
                "El corte de caja es el proceso de revisar y contar todas las transacciones diarias de una tienda para garantizar que el efectivo coincida con las ventas registradas. Los informes parciales proporcionan actualizaciones a lo largo del día sobre el rendimiento de la tienda, como ventas por hora y existencias. Estos dos elementos son fundamentales para mantener el control financiero y tomar decisiones informadas en una tienda punto de venta."));
        itemList.add(new Item("Dar Surtido de Alta", "Inventario Tienda",
                " F5+F1", "" +
                "Dar de alta un surtido significa añadir nuevos productos a la venta en una tienda o negocio. Esto implica agregar información sobre estos productos, como su nombre, precio, descripción y cualquier otra información relevante, para que los clientes puedan comprarlos"));
        itemList.add(new Item("Busqueda de Cliente", "Informacion Cliente",
                " F2+F2", "" +
                "La búsqueda de cliente es el acto de buscar y encontrar información sobre un cliente en una base de datos o sistema. Esto se hace para acceder a detalles como su nombre, historial de compras, datos de contacto y otra información relevante. La búsqueda de cliente es útil para proporcionar un servicio personalizado y realizar un seguimiento de las interacciones con los clientes."));
        itemList.add(new Item("Menu Corresponsales", "Servicios Financieros",
                " F4+F8+F3", "" +
                "El menú de corresponsales financieros es una lista de servicios que los corresponsales financieros pueden ofrecer en nombre de una institución financiera, como depósitos, retiros, pagos de servicios, transferencias de dinero y otros servicios bancarios. Estas opciones permiten que las personas realicen transacciones financieras en lugares donde la institución financiera no tiene sucursales físicas, gracias a la colaboración con corresponsales autorizados."));
        //F1----------------------------------------------------------------------------------------------------------------
        itemList.add(new Item(" Ayuda", "Notas de ventas ropa",
                "F1+F1 ", "Refiere a la disponibilidad de información, tutoriales o recursos que los usuarios pueden utilizar para comprender y utilizar la aplicación de manera efectiva. " +
                ""));
        itemList.add(new Item("Consultas ", "Notas de ventas ropa",
                " F1+F2", "solicitudes de datos o acciones específicas que un usuario realiza para obtener respuestas o resultados precisos. Por ejemplo, en una aplicación de bases de datos, los usuarios pueden realizar consultas para recuperar información específica de la base de datos, como buscar registros que cumplan ciertos criterios." +
                ""));
        itemList.add(new Item("Consulta de Alta y Baja de Vendedores ", "Notas de ventas ropa",
                " F1+F3", "Una \"consulta de alta y baja de vendedores\" es una solicitud de información relacionada con la incorporación y desvinculación de vendedores en un sistema o base de datos.Alta de vendedores: Se refiere a la acción de registrar o agregar nuevos vendedores al sistema. Esto implica ingresar información como nombre, contacto, área de ventas, etc., para dar de alta a un nuevo vendedor en la base de datos.Baja de vendedores: Se refiere a la acción de eliminar o desactivar vendedores existentes en el sistema. Esto puede implicar la desvinculación de un vendedor que ya no trabaja para la empresa o la eliminación de su perfil de la base de datos." +
                ""));
        itemList.add(new Item("Cheques y Dolares ", "Notas de ventas ropa",
                "F1+F4 ", "Cheques: Un cheque es un documento financiero que se utiliza para efectuar pagos. Es una orden escrita que una persona o entidad emite a su banco para transferir una cierta cantidad de dinero de su cuenta bancaria a la cuenta del beneficiario, que puede ser una persona o una empresa. Los cheques son una forma común de realizar transacciones financieras, y los bancos son los encargados de procesarlos.Dólares: Los dólares son la moneda oficial de varios países, siendo el dólar estadounidense (USD) el más ampliamente reconocido. El dólar es una moneda utilizada en transacciones internacionales y es una de las monedas de reserva más importantes del mundo. En el contexto financiero, se utilizan dólares para representar una unidad de valor que puede ser utilizada en transacciones globales o para medir el valor de activos, inversiones, deudas, etc.Cuando se mencionan juntos, es posible que se refiera a transacciones financieras que involucran cheques escritos en dólares estadounidenses u otra moneda. Los cheques en dólares suelen ser utilizados en transacciones internacionales o cuando se necesita realizar pagos en una moneda diferente a la local." +
                ""));
        itemList.add(new Item("Movimientos de Inventario ", "Notas de ventas ropa",
                "F1+F5 ", "Los \"movimientos de inventario\" se refieren a las transacciones que implican la entrada o salida de productos o mercancías en un sistema de inventario, ya sea físico o digital. Estos movimientos son esenciales para llevar un registro preciso de las existencias de una empresa. Aquí hay algunos ejemplos de movimientos de inventario:Entrada de mercancía: Cuando se recibe nueva mercancía o productos en un almacén o sistema de inventario, se registra como una entrada de inventario. Esto puede deberse a compras, donaciones, o cualquier otra forma de adquirir nuevos productos.Salida de mercancía: Cuando se venden productos o se retiran del inventario para su uso interno, se registra como una salida de inventario. Esto reduce la cantidad disponible en stock.Transferencias entre ubicaciones: Si una empresa tiene múltiples ubicaciones o almacenes, los movimientos de inventario pueden incluir la transferencia de productos entre estas ubicaciones.Ajustes de inventario: A veces, es necesario realizar ajustes en el inventario debido a discrepancias, daños, o pérdidas. Estos ajustes se registran como movimientos de inventario.Devoluciones de clientes o proveedores: Cuando un cliente devuelve un producto o un proveedor acepta una devolución, se registra como un movimiento de inventario que puede implicar una entrada o una salida, según el caso.Consumo interno: Si una empresa utiliza productos internamente en lugar de venderlos, se registra como un movimiento de inventario para reflejar esta disminución en el stock.El seguimiento preciso de los movimientos de inventario es crucial para gestionar eficazmente las existencias, controlar los costos y satisfacer la demanda de los clientes. En sistemas informáticos, el registro de estos movimientos se realiza mediante software de gestión de inventario." +
                ""));
        itemList.add(new Item("Proceso de Cierre ", "Notas de ventas ropa",
                " F1+F6", "Proceso de Cierre Contable: En el ámbito financiero y contable, el proceso de cierre se refiere al conjunto de actividades que una empresa lleva a cabo al final de un período contable, como un mes o un año, para finalizar y consolidar sus registros financieros. Este proceso incluye la revisión de cuentas, ajustes contables, la preparación de estados financieros (como el balance y el estado de resultados), y la declaración de resultados para ese período. El objetivo principal es asegurarse de que los registros reflejen con precisión la situación financiera de la empresa al final del período." +
                ""));
        itemList.add(new Item("Reportes ", "Notas de ventas ropa",
                " F1+F7", "Reportes financieros: Estos informes proporcionan detalles sobre la situación financiera de una empresa, como estados de resultados, balances, flujos de efectivo y análisis de costos.Reportes de ventas: Muestran datos relacionados con las ventas de productos o servicios, como ingresos, unidades vendidas, tendencias de ventas, y análisis de clientes.Reportes de inventario: Proporcionan información sobre la cantidad y el valor de los productos en stock en un momento dado.Reportes de rendimiento de empleados: Resumen el desempeño de los empleados, incluyendo evaluaciones, objetivos cumplidos y métricas de productividad." +
                ""));
        itemList.add(new Item("Procesos de Emergencia ", "Notas de ventas ropa",
                "F1+F8 ", "Los \"procesos de emergencia\" son procedimientos o acciones específicas que se activan en situaciones de crisis o eventos inesperados para garantizar la seguridad y la gestión efectiva de la situación. Estos procesos están diseñados para responder a amenazas, desastres naturales, accidentes, incidentes críticos o cualquier otra circunstancia que pueda poner en peligro la vida, la propiedad o el bienestar de las personas." +
                ""));
        itemList.add(new Item("Cargos por Faltante ", "Notas de ventas ropa",
                "F1+F9 ", "Cargos por faltante de inventario: En el ámbito de la gestión de inventario, si falta mercancía o productos en el almacén, esto puede dar lugar a cargos por faltante que se aplican a la cuenta de la persona o entidad responsable de la gestión del inventario." +
                ""));
        itemList.add(new Item("Bloquear Sistema Coppel ", " Notas de ventas ropa",
                " F10", "Bloqueo de seguridad para evitar fraudes." +
                ""));
        //F2----------------------------------------------------------------------------------------------------------------
        itemList.add(new Item("Consultar Notas del Día ", "Menu de consulta de Notas",
                "F2+F1 ", "Consulta todas las notas de compra del día " +
                ""));
        itemList.add(new Item("Consultar Operaciones de Días Anteriores ", "Menu de consulta de Notas",
                "F1+F2 ", "implica revisar y obtener información detallada sobre las transacciones, actividades o registros que se llevaron a cabo en fechas anteriores a la actual." +
                ""));
        itemList.add(new Item("Consulta General de Notas ", "Menu de consulta de Notas",
                "F1+F3 ", "Una consulta general de notas implica revisar y acceder a todas las notas o registros que has creado o guardado en una aplicación, sistema o plataforma." +
                ""));
        //F5----------------------------------------------------------------------------------------------------------------
        itemList.add(new Item("Menu de Transferencia ", "Menu de Movimientos al Inventario",
                " F5+F1", "Un \"menú de transferencia de mercancía\" es una parte de un sistema o software de gestión de inventario o logística que permite a los usuarios administrar y realizar transferencias de productos o mercancías de un lugar a otro. Este tipo de menú es comúnmente utilizado en empresas, almacenes y cadenas de suministro para llevar un registro de la movilización de mercancía entre diferentes ubicaciones o almacenes.El menú de transferencia de mercancía generalmente incluye opciones como:Origen y destino: Los usuarios seleccionan la ubicación de origen (dónde se toma la mercancía) y la ubicación de destino (dónde se enviará la mercancía).Selección de productos: Los usuarios eligen los productos o artículos específicos que serán transferidos.Cantidad: Se indica la cantidad de cada producto que se transferirá.Confirmación: Se requiere una confirmación para autorizar la transferencia, y a menudo se generan documentos de seguimiento, como guías de remisión.Registro y seguimiento: El sistema registra la transferencia y permite a los usuarios dar seguimiento al estado de la misma." +
                ""));
        itemList.add(new Item("Menu de Surtidos ", "Menu de Movimientos al Inventario",
                " F5+F2", "sistema de gestión de inventario o comercio minorista que permite a los usuarios crear, modificar y gestionar surtidos de productos o mercancías. Los surtidos son grupos específicos de productos que se combinan y se ofrecen juntos como una colección o conjunto. Esto se utiliza comúnmente en tiendas minoristas, en línea o físicas, para promocionar productos relacionados y ofrecer a los clientes una selección coordinada de productos." +
                ""));
        itemList.add(new Item(" Menu de Inventario Fisicos", "Menu de Movimientos al Inventario",
                "F5+F3 ", "Un \"menú de inventario físico\" se refiere a una parte de un sistema de gestión de inventario que permite a los usuarios llevar a cabo procesos de recuento y verificación de los productos o activos físicos en existencia en una ubicación determinada. Este tipo de menú es esencial para mantener un registro preciso de los artículos en stock y asegurar que coincida con los registros del sistema." +
                ""));
        itemList.add(new Item("Consultar Inventario por pantalla ", "Menu de Movimientos al Inventario",
                " F5+F4", "La opción de \"consultar inventario por pantalla\" se refiere a una función en un sistema de gestión de inventario que permite a los usuarios ver y acceder a información detallada sobre los productos o artículos en el inventario a través de la pantalla de un ordenador o dispositivo. " +
                ""));
        itemList.add(new Item("Listado de Existencias ", "Menu de Movimientos al Inventario",
                " F5+F5", "Un \"listado de existencias\" se refiere a un documento o informe que enumera y detalla los productos o artículos específicos que una empresa o entidad tiene en stock o en inventario en un momento dado. Este listado proporciona una visión general de los productos disponibles y sus cantidades, lo que es esencial para la gestión de inventario y la toma de decisiones relacionadas con compras, ventas y logística.Un listado de existencias suele incluir la siguiente información:Nombre o descripción del producto: El nombre o descripción que identifica de manera única cada artículo en inventario.Cantidad en stock: La cantidad exacta de cada producto disponible en el inventario en ese momento.Ubicación en el almacén: La ubicación física de cada producto en el almacén o la tienda.Código de producto o SKU: Un identificador único, como un código de barras o un SKU, que facilita la identificación de cada artículo.Valor en inventario: El valor total de los productos en stock, calculado multiplicando la cantidad por el precio unitario.Información adicional: Puede incluir información sobre proveedores, fechas de llegada, fechas de vencimiento, entre otros detalles relevantes." +
                ""));
        itemList.add(new Item("Actualizar Ajustes por Sistemas ", "Menu de Movimientos al Inventario",
                "F5+F6 ", "se refiere a la acción de realizar cambios o modificaciones en la configuración de un sistema o software a través de su interfaz o panel de control. Estos ajustes pueden estar relacionados con diversas configuraciones, como preferencias de usuario, configuraciones de seguridad, opciones de privacidad, configuraciones de red, y muchas otras." +
                ""));
        itemList.add(new Item("Menu Cifras de Control de Ropa ", "Menu de Movimientos al Inventario",
                "F5+F7 ", "Un \"listado de existencias\" se refiere a un documento o informe que enumera y detalla los productos o artículos específicos que una empresa o entidad tiene en stock o en inventario en un momento dado. Este listado proporciona una visión general de los productos disponibles y sus cantidades, lo que es esencial para la gestión de inventario y la toma de decisiones relacionadas con compras, ventas y logística." +
                ""));
        itemList.add(new Item("Menú Calendario de Devolución", "Menu de Movimientos al Inventario",
                "F5+F8 ", "Un menú de calendario de devolución es una característica en un sistema o aplicación que permite a los usuarios gestionar y hacer un seguimiento de las devoluciones de productos o mercancías dentro de un calendario específico. Esto es común en entornos minoristas o de comercio electrónico, donde los clientes pueden devolver productos de acuerdo con una política de devolución determinada." +
                ""));
        itemList.add(new Item("Menú de Retiquetado", "Menu de Movimientos al Inventario",
                " F5+F9", "Un menú de retiquetado es una característica o función en un sistema de gestión de inventario, software de comercio minorista o aplicación que permite a los usuarios cambiar o volver a etiquetar productos con etiquetas o códigos de barras actualizados. Esta función es común en empresas minoristas y almacenes, donde se requiere actualizar etiquetas de precios, códigos de barras u otra información en productos existentes." +
                ""));
        itemList.add(new Item("Imprimir Poliza de Siniestro", "Menu de Movimientos al Inventario",
                "F5+F10 ", "Imprimir una póliza de siniestro generalmente implica obtener una copia de un documento que describe los detalles y las condiciones de una reclamación de seguro. Este documento es proporcionado por la compañía de seguros o el asegurador y suele ser generado después de que un titular de póliza presenta una reclamación por un incidente cubierto por su póliza de seguro." +
                ""));
        //F6----------------------------------------------------------------------------------------------------------------
        itemList.add(new Item("Menú de Retiros Parciales ", "Menu del Dia",
                "F6+F1 ", "Un menú de retiros parciales generalmente se refiere a un conjunto de opciones o funciones en una plataforma financiera o sistema de inversión que permite a los usuarios retirar parte de sus fondos." +
                ""));
        itemList.add(new Item("Realizar Corte y Retiros Parciales ", "Menu del Dia",
                " F6+F2", "Para un punto de venta, \"realizar un corte y retiros parciales\" se refiere a un procedimiento financiero en el que se cierra el turno de ventas en el sistema de punto de venta y se retira una parte de los ingresos en efectivo para ser depositada en la caja fuerte o en una cuenta bancaria. Esto es común en entornos comerciales y minoristas para llevar un registro preciso de las ventas y garantizar la seguridad de los fondos." +
                ""));
        itemList.add(new Item(" Realizar Pase de Ropa ", "Menu del Dia",
                "F6+F3 ", "Finalización del día, cierra todas las cajas para empezar un nuevo día." +
                ""));
        itemList.add(new Item("Imprimir Totales de Notas", "Menu del Dia",
                "F6+F4 ", "Impresión de todos los movimientos críticos como pueden ser cambios, devoluciones, autorizaciones de compra." +
                ""));
        itemList.add(new Item("Cancelación de Corte de Caja Individual", "Menu del Dia",
                "F6+F5 ", "La cancelación de un corte de caja individual es un proceso que, en la mayoría de los casos, no se recomienda, ya que el objetivo principal de un corte de caja es registrar y documentar con precisión las transacciones financieras y los totales. Sin embargo, en ciertas situaciones, puede ser necesario deshacer un corte de caja incorrecto o mal ejecutado." +
                ""));
        //F7----------------------------------------------------------------------------------------------------------------
        itemList.add(new Item(" Reporte de Descuentos ", "Reportes",
                "F7+F1 ", "Un reporte de descuentos es un documento o informe que detalla y muestra de manera organizada los descuentos aplicados a transacciones, ventas, facturas o compras en un negocio o empresa durante un período de tiempo específico. Estos descuentos pueden incluir descuentos promocionales, descuentos por cantidad, descuentos por lealtad del cliente, entre otros. La creación y análisis de un reporte de descuentos es importante para evaluar el impacto de las estrategias de precios y promociones en un negocio, así como para llevar un registro de las concesiones de descuentos realizadas." +
                ""));
        itemList.add(new Item("Reporte de Calendario de Inventarios Parciales", "Reportes",
                "F7+F2 ", "Un reporte de calendario de inventarios parciales es un documento que proporciona una programación detallada de cuándo se llevarán a cabo los conteos o recuentos parciales de inventario en una empresa o negocio. Estos inventarios parciales implican contar y registrar solo una parte de los productos o activos almacenados en lugar de realizar un conteo completo en un solo día. El objetivo principal de este enfoque es mantener un control preciso del inventario a lo largo del tiempo y minimizar las interrupciones operativas." +
                ""));
        itemList.add(new Item("Reporte de Movimientos del Mes", "Reportes",
                " F7+F3", "Un reporte de movimientos del mes es un documento que resume y presenta de manera detallada todas las transacciones, actividades o eventos relevantes que ocurrieron en un negocio o entidad durante un mes calendario específico. Este tipo de informe es comúnmente utilizado en la gestión financiera y contable para realizar un seguimiento de los ingresos, gastos, transacciones financieras y otras actividades comerciales durante un período de tiempo específico." +
                ""));
        itemList.add(new Item("Reimpresión de Estadisticas de Vendedor ", "Reportes",
                "F7+F4 ", "La reimpresión de estadísticas de vendedor se refiere a la generación de un nuevo informe o documento que muestra las estadísticas y métricas de desempeño de un vendedor en un período determinado. Estas estadísticas pueden incluir datos sobre ventas, comisiones, número de clientes atendidos, productos vendidos y otros indicadores clave de rendimiento." +
                ""));
        itemList.add(new Item(" Consulta de Estadisticas Por Departamento", "Reportes",
                " F7+F5", "La consulta de estadísticas por departamento implica la obtención de información detallada sobre el rendimiento y las métricas específicas relacionadas con uno o varios departamentos en una organización. Estas estadísticas pueden incluir datos financieros, de ventas, de producción, de calidad o cualquier otro tipo de métricas que sean relevantes para un departamento en particular. Aquí tienes una guía general sobre cómo llevar a cabo una consulta de estadísticas por departamento" +
                ""));



        // Agrega más elementos aquí si es necesario

        // Configura el RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new com.example.coppelayuda.adapters.ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

        // Configura la búsqueda en el RecyclerView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                itemAdapter.getFilter().filter(newText);
                return false;
            }
        });

        // Configura el click listener para abrir la actividad de detalle
        itemAdapter.setOnItemClickListener(new com.example.coppelayuda.adapters.ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Obtiene el elemento de la lista en la posición clicada
                Item clickedItem = itemList.get(position);

                // Crea un intent para abrir la actividad de detalle
                Intent intent = new Intent(RopaActivity.this, DetalleActivity.class);
                // Pasa los valores de "proceso", "ruta" y "explicación" como extras en el intent
                intent.putExtra("proceso", clickedItem.getProceso());
                intent.putExtra("ruta", clickedItem.getRuta());
                intent.putExtra("explicacion", clickedItem.getExplicacion());

                // Inicia la actividad de detalle
                startActivity(intent);
            }
        });
    }
}

