import java.time.LocalDate

abstract  class PessoaFisica (
    var cpf: String,
    var rg: String,
    var nomeCompleto: String,
    var dataDeNascimento: LocalDate,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
): Pessoa(
    endereco = endereco,
    telefone = telefone,
    email = email,
    codigo = codigo,
)