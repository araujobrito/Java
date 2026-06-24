package domain.cliente;

import jakarta.validation.constraints.NotNull;

public record ClienteResponseDTO(

        Long Id,
        String razaoSocial,
        String cnpj,
        String nomeResponsavel,
        String email,
        String telefone
) {
    public ClienteResponseDTO(@NotNull com.aula.api.domain.cliente.Cliente cliente){
        this(
                cliente.getId(),
                cliente.getRazaoSocial(),
                cliente.getCnpj(),
                cliente.getNomeResponsavel(),
                cliente.getEmail(),
                cliente.getTelefone()
        );
    }
}
