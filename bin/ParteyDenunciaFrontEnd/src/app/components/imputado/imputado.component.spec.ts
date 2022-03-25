import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImputadoComponent } from './imputado.component';

describe('ImputadoComponent', () => {
  let component: ImputadoComponent;
  let fixture: ComponentFixture<ImputadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImputadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImputadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
