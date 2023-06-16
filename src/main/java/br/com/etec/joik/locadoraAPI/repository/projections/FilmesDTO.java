package br.com.etec.joik.locadoraAPI.repository.projections;

public class FilmesDTO {
    private Long id;
    private String nomefilme;
    private String descricao;
    private String nomeator;

    public FilmesDTO(Long id, String nomefilme, String descricao, String nomeator) {
        this.id = id;
        this.nomefilme = nomefilme;
        this.descricao = descricao;
        this.nomeator = nomeator;
    }
}
