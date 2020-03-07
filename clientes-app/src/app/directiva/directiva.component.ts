import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html',
  styleUrls: ['./directiva.component.css']
})
export class DirectivaComponent implements OnInit {

  listaCurso: string[] = ["Typescript", "Javascript", "Java SE", "CSS"];
  habilitar: boolean = true
  constructor() { }

  ngOnInit() {
  }

}
