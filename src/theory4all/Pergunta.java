class Pergunta{
  private int id;
  private byte quantidadeDeAlternativas;
  private byte alternativaCorreta;
  private String pergunta;

  public int getId(){
       return id;
   }// End getId

   public void setId(int id){
       this.id = id;
   }// End setId()

   public byte getQuantidadeDeAlternativas(){
        return quantidadeDeAlternativas;
    }// End getQuantidadeDeAlternativas()

    public void setQuantidadeDeAlternativas(byte quantidadeDeAlternativas){
        this.quantidadeDeAlternativas = quantidadeDeAlternativas;
    }// End setQuantidadeDeAlternativas()

    public byte getAlternativaCorreta(){
         return alternativaCorreta;
     }// End getAlternativaCorreta()

     public void setAltenativaCorreta(byte alternativaCorreta){
         this.alternativaCorreta = alternativaCorreta;
     }// End setAlternativaCorreta()

     public byte getPergunta(){
          return pergunta;
      }// End getAlternativaCorreta()

      public void setPergunta(byte pergunta){
          this.pergunta = pergunta;
      }// End setAlternativaCorreta()
}
  
}
