import java.time.LocalDate

abstract class Funcionario (
    var salario: String,
    var setor: String,
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
)