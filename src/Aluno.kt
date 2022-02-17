import java.time.LocalDate

class Aluno(
    var matriculaEscolar: String,
    var sala: String,
    var ano: String,
    var curso: String,
    var escola: String,
    var turno: String,
    cpf: String,
    rg: String,
    nomeCompleto: String,
    dataDeNascimento: LocalDate,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,

    ) : PessoaFisica(
    cpf = cpf,
    rg = rg,
    nomeCompleto = nomeCompleto,
    dataDeNascimento = dataDeNascimento,
    endereco = endereco,
    telefone = telefone,
    email = email,
    codigo = codigo,
) {
    override fun toString(): String {
        return "-=- Dados do Aluno -=-\n"+
                "- CPF: $cpf\n" +
                "- RG: $rg\n" +
                "- Nome Completo: $nomeCompleto\n" +
                "- Data de nascimento: $dataDeNascimento\n" +
                "- Endereço: $endereco\n" +
                "- Telefone: $telefone\n"+
                "- Email: $email\n"+
                "- Código: $codigo\n"+
                "- Ano: $ano\n"+
                "- Curso: $curso\n"+
                "- Escola: $escola\n"+
                "- Sala: $sala\n"+
                "- Turno: $turno\n"+
                "- Matricula Escolar: $matriculaEscolar\n";
    }
}