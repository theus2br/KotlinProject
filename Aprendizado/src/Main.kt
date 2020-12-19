import javax.swing.JOptionPane

fun main() {
    val cliente = Cliente()
    val createClient = AdicionarPessoa(cliente)
    val createSecondClient = Cliente("Mariana bostinha", 12)
    val createListClients = Clientes(listOf(createClient, createSecondClient))

    println(createListClients)
}

fun listaPessoas(clientes: Clientes, cliente: Cliente){

    clientes
}
fun AdicionarPessoa(cliente: Cliente): Cliente{
    cliente.nome = JOptionPane.showInputDialog("Digite seu nome");
    cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"))
    return cliente
}
