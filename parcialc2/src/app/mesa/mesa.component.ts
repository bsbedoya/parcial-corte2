import { Component, OnInit } from '@angular/core';
import {IonicModule} from '@ionic/angular';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mesa',
  templateUrl: './mesa.component.html',
  styleUrls: ['./mesa.component.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule],

})
export class MesaComponent {
  mesas = [
    { numero: 1, disponible: true },
    { numero: 2, disponible: false },
    { numero: 3, disponible: true },
    { numero: 4, disponible: false },
    { numero: 5, disponible: true },
  ];

  selectedTable: string = ''; // Variable para almacenar la mesa seleccionada

  onTableChange(event: any) {
    console.log('Mesa seleccionada:', event);
  }
}
