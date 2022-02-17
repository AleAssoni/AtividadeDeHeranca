import java.time.LocalDate

class Professor (
    var sala: String,
    var curso: String,
    var escola: String,
    salario: String,
    setor: String,
    turno: String,
    cpf: String,
    rg: String,
    nomeCompleto: String,
    dataDeNascimento: LocalDate,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
) : Funcionario(
    salario = salario,
    setor = setor,
    turno = turno,
    cpf = cpf,
    rg = rg,
    nomeCompleto = nomeCompleto,
    dataDeNascimento = dataDeNascimento,
    endereco = endereco,
    telefone = telefone,
    email = email,
    codigo = codigo,
){
    override fun toString(): String {
        return "-=- Dados do Professor -=-\n" +
                "- CPF: $cpf\n" +
                "- RG: $rg\n" +
                "- Nome Completo: $nomeCompleto\n" +
                "- Data de nascimento: $dataDeNascimento\n" +
                "- Endereço: $endereco\n" +
                "- Telefone: $telefone\n" +
                "- Email: $email\n" +
                "- Código: $codigo\n" +
                "- Turno: $turno\n" +
                "- Salario: $salario\n" +
                "- Setor: $setor\n" +
                "- Sala: $sala\n" +
                "- Curso: $curso\n" +
                "- Escola: $escola\n";
    }
}