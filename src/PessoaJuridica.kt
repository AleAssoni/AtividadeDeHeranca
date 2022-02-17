import java.time.LocalDate

abstract class PessoaJuridica(
    var cnpj: String,
    var razaoSocial: String,
    var nomeFantasia: String,
    var dataDeFundacao: LocalDate,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
) : Pessoa(
    endereco = endereco,
    telefone = telefone,
    email = email,
    codigo = codigo,
)