import java.time.LocalDate

fun main() {
      val aluno = Aluno(
        cpf = "12345678901",
        rg = "987654321",
        nomeCompleto = "Alexandre Assoni",
        dataDeNascimento = LocalDate.now(),
          endereco = "Rua Batista Fontana - n:2",
          telefone = "98002-8922",
          email = "Alezin@gmail.com",
          codigo= 19,
            ano = "Segundo",
            curso = "Médio",
            escola = "Sarmento Leite",
            sala = "10",
            turno = "Manhã",
            matriculaEscolar = "000052",
      )

      val professor = Professor(
        cpf = "12345678900",
        rg = "123456789",
        nomeCompleto = "Anderson Coimbra Choren",
        dataDeNascimento = LocalDate.now(),
          endereco = "Av Assis Brasil - n:524",
          telefone = "98754-2513",
          email = "ProfessorChoren@gmail.com",
          codigo= 112,
            turno = "Tarde",
            salario = "R$5,000",
            setor = "Informatica",
              sala = "01",
              curso = "Curso técnico de informatica e internet",
              escola = "Qi",
    )

    val secretario = Secretario(
      cpf = "85308132648",
      rg = "396401130",
      nomeCompleto = "Marcello Melo da Silva",
      dataDeNascimento = LocalDate.now(),
        endereco = "Av Farrapos",
        telefone = "98765-0254",
        email = "MarcelloMeladao@gmail.com",
        codigo= 67,
          turno = "Manhã",
          salario = "R$1,700",
          setor = "Atendimento",
            bilingue = true
    )
    println(aluno)
    println(professor)
    println(secretario)
}