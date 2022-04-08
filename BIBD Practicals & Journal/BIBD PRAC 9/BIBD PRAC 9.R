readinteger <- function()
{
  n <- readline(prompt = "Enter value for k-1:")
  k <- as.integer(n)
  u1 <- readLines("/cloud/project/input.txt")
  Shingle <- 0
  i <- 0
  while(i<nchar(u1)-k+1)
  {
    Shingle[i] <- substr(u1, start=i, stop=i+k)
    print(Shingle[i])
    i = i+1
  }
}

if(interactive()) readinteger()
