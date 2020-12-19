import javax.swing.JOptionPane

fun main() {
    val cliente = Cliente()
    val clientes = Clientes()

    val createClient = AdicionarPessoas(clientes, cliente)
    println(createClient)
}

fun AdicionarPessoas(clientes: Clientes, cliente:Cliente): Clientes{
    cliente.nome = JOptionPane.showInputDialog("Digite seu nome");
    cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"))

    listOf(clientes)
    return clientes
}
