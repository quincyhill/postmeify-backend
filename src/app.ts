import express, { Application, Request, Response, NextFunction } from 'express'

const app: Application = express()

app.get('/', (req: Request, res: Response, next: NextFunction) => {
  res.send('Hello World!')
})

app.listen(5000, () => console.log('server running on port 5000...'))
